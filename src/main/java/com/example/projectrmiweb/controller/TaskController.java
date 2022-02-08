package com.example.projectrmiweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TaskController {
    @GetMapping("")
    public String getAllTask(){
        return "html/task-list";
    }

    @GetMapping("/new-task")
    public String createTask(){
        return "html/create-task";
    }

    @GetMapping("/detail")
    public String getTaskDetail(){
        return "html/task-detail";
    }
}
