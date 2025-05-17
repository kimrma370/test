package com.example.service;

import com.example.dto.OaccDto;
import com.example.ottplatform.entity.Oacc;
import com.example.repository.OaccRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OaccService {
    private final OaccRepository oaccRepository;

    public OaccService(OaccRepository oaccRepository) {
        this.oaccRepository = oaccRepository;
    }

    public Optional<OaccDto> getOaccById(Long id) {
        return oaccRepository.findById(id)
                .map(oacc -> {
                    OaccDto dto = new OaccDto();
                    dto.setId(oacc.getId());
                    dto.setAccountNumber(oacc.getAccountNumber());
                    dto.setAccountType(oacc.getAccountType());
                    dto.setStatus(oacc.getStatus());
                    return dto;
                });
    }

    // 추가적인 서비스 메소드 정의 가능
}
