package com.example.projectrmiweb.service;

import com.example.projectrmiweb.model.Task;
import com.example.projectrmiweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface TaskService {
    Task save(Task task);
}
