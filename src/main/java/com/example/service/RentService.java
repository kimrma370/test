package com.example.service;

import com.example.dto.RentDto;
import com.example.ottplatform.entity.Oacc;
import com.example.ottplatform.entity.Ott;
import com.example.ottplatform.entity.Rent;
import com.example.repository.OaccRepository;
import com.example.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RentService {

    private final RentRepository rentRepository;
    private final OaccRepository oaccRepository;
    private final OaccService oaccService;
    public List<RentDto> findByUserno(Long userno) {
        List<Rent> rents = rentRepository.findByUserno(userno);

        return rents.stream().map(r -> {
            RentDto dto = new RentDto();
            dto.setRentno(r.getRentno());
            dto.setRstart(r.getRstart());
            dto.setRexpiry(r.getRexpiry());

            Optional<Oacc> oaccOpt = oaccRepository.findById(r.getOaccno());
            if (oaccOpt.isPresent()) {
                Oacc oacc = oaccOpt.get();
                dto.setOaccema(oacc.getOaccema());

                Ott ott = oacc.getOtt();
                dto.setOtype(ott.getOtype());
            }

            return dto;
        }).collect(Collectors.toList());
    }
}
