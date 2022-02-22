package com.example.projectrmiweb.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User mUser;

    private String title;
    private String inputFilePath;
    private int calculationMethod;
    private String methodFilePath;
    private int status;
    private String resultPath;
}
