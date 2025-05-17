package com.example.repository;

import com.example.ottplatform.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Long> {
    // 추가적인 쿼리 메소드 정의 가능
}