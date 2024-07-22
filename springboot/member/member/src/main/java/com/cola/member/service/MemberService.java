package com.cola.member.service;

import com.cola.member.domain.dto.MemberDTO;
import com.cola.member.domain.entity.MemberEntity;
import com.cola.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity변환
        // 2. repository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        // repository의 save메서드 호출 (조건. entity객체를 넘겨줘야함)
    }

    public MemberDTO login(MemberDTO memberDTO) {
        // 1. 회원이 입력한 이메일로 db에서 조회
        // 2. db에서 조회한 비밀번호와 입력한 비밀번호 일치확인

        Optional<MemberEntity> byEmail = memberRepository.findByEmail(memberDTO.getEmail());
        if(byEmail.isPresent()){
            // 조회 결과가 있다.
            MemberEntity memberEntity = byEmail.get();
            if(memberEntity.getPassword().equals(memberDTO.getPassword())){
                // 비밀번호 일치
                // entity -> dto
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            }else {
                // 비밀번호 불일치
                return null;
            }
        }else {
            //조회 결과가 없다.
            return null;
        }
    }

    public String emailCheck(String email) {
        Optional<MemberEntity> byEmail = memberRepository.findByEmail(email);
        if(byEmail.isPresent()){
            // 조회결과 있다 -> 사용할 수 없다.
            return null;
        }else{
            // 조회결과 없다 -> 사용할 수 없다.
            return "ok";
        }
    }
}
