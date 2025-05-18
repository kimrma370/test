package com.example.repository;

import com.example.ottplatform.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findByUserno(Long userno);
}
