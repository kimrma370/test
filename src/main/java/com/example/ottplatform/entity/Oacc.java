package com.example.ottplatform.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "oacc")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Oacc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oaccno;

    @ManyToOne
    @JoinColumn(name = "ottno", nullable = false)
    private Ott ott;

    private String oaccema;
    private String oaccpw;
}
