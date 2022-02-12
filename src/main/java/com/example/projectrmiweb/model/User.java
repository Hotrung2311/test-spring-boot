package com.example.projectrmiweb.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String fullName;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
