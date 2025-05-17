package com.example.service;

import com.example.dto.RentDto;
import com.example.ottplatform.entity.Rent;
import com.example.repository.RentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentService {
    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    public Optional<RentDto> getRentById(Long id) {
        return rentRepository.findById(id)
                .map(rent -> {
                    RentDto dto = new RentDto();
                    dto.setId(rent.getId());
                    dto.setUserId(rent.getUserId());
                    dto.setOttId(rent.getOttId());
                    dto.setRentDate(rent.getRentDate());
                    dto.setReturnDate(rent.getReturnDate());
                    return dto;
                });
    }

    // 추가적인 서비스 메소드 정의 가능
}
