package com.example.projectrmiweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    @GetMapping("/")
    public String homepage() {
        return "/html/homepage"; // Trả về home.html
    }

    @GetMapping("/taskList")
    public String getTaskList() {
        return "/html/task-list"; // Trả về home.html
    }
}
