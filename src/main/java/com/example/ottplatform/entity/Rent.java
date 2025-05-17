package com.example.ottplatform.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rent")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long ottId;
    private String rentDate;
    private String returnDate;
}