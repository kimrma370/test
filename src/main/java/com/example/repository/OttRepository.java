package com.example.repository;

import com.example.ottplatform.entity.Ott;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OttRepository extends JpaRepository<Ott, Integer> {
    // 추가적인 쿼리 메소드 정의 가능
}
