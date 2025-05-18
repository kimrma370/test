package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ottplatform.entity.Ott;
import com.example.repository.OttRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OttService {
    private final OttRepository ottRepository;

    public List<Ott> findAll() {
        return ottRepository.findAll();
    }
}

