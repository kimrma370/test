package com.example.dto;

import lombok.Data;

@Data
public class RentDto {
    private Long id;
    private Long userId;
    private Long ottId;
    private String rentDate;
    private String returnDate;
}
