package com.cola.member.domain.dto;

import com.cola.member.domain.entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor  // 기본생성자 자동으로 생성
@ToString
public class MemberDTO {

    private Long id;
    private String email;
    private String password;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setEmail(memberEntity.getEmail());
        memberDTO.setPassword(memberEntity.getPassword());
        return memberDTO;
    }
}
