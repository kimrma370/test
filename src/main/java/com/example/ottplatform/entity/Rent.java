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
    private Long rentno;

    @Column(nullable = false)
    private Long userno;

    @Column(nullable = false)
    private Long oaccno;

    private String rstart;
    private String rexpiry;
}
