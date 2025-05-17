package com.example.service;

import com.example.dto.OttDto;
import com.example.ottplatform.entity.Ott;
import com.example.repository.OttRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OttService {
    private final OttRepository ottRepository;

    public OttService(OttRepository ottRepository) {
        this.ottRepository = ottRepository;
    }

    public Optional<OttDto> getOttById(Long id) {
        return ottRepository.findById(id)
                .map(ott -> {
                    OttDto dto = new OttDto();
                    dto.setId(ott.getId());
                    dto.setName(ott.getName());
                    dto.setDescription(ott.getDescription());
                    return dto;
                });
    }

    // 추가적인 서비스 메소드 정의 가능
}
