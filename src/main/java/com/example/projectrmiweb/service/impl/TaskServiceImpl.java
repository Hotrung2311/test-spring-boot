package com.example.projectrmiweb.service.impl;

import com.example.projectrmiweb.model.Task;
import com.example.projectrmiweb.repository.TaskRepository;
import com.example.projectrmiweb.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
