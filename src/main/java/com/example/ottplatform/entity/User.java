package com.example.ottplatform.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userno;

    @Column(nullable = false, unique = true)
    private String uid;

    @Column(nullable = false)
    private String upw;

    @Column(nullable = false)
    private String role; // "user" 또는 "admin"
}
