package com.cola.member.repository;

import com.cola.member.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// pk의 타입
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?)
    Optional<MemberEntity> findByEmail(String email);
}
