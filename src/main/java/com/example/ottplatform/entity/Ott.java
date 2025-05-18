package com.example.ottplatform.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ott")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ott {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ottno;

    @Column(nullable = false, unique = true)
    private String otype;
}
