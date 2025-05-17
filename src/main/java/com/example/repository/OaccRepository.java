package com.example.repository;

import com.example.ottplatform.entity.Oacc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OaccRepository extends JpaRepository<Oacc, Long> {
    // 추가적인 쿼리 메소드 정의 가능
}
