package com.example.service;

import com.example.dto.OaccDto;
import com.example.ottplatform.entity.Oacc;
import com.example.ottplatform.entity.Ott;
import com.example.repository.OaccRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OaccService {

    private final OaccRepository oaccRepository;

    public Optional<OaccDto> getOaccById(Long id) {
        return oaccRepository.findById(id)
                .map(oacc -> {
                    OaccDto dto = new OaccDto();
                    dto.setOaccno(oacc.getOaccno());             // ✅ Oacc의 기본 키
                    dto.setOaccema(oacc.getOaccema());
                    dto.setOaccpw(oacc.getOaccpw());

                    Ott ott = oacc.getOtt();
                    dto.setOtype(ott != null ? ott.getOtype() : null);

                    return dto;
                });
    }
}
