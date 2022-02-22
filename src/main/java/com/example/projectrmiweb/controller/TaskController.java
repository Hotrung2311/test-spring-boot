package com.example.projectrmiweb.controller;

import com.example.projectrmiweb.model.Task;
import com.example.projectrmiweb.model.User;
import com.example.projectrmiweb.service.TaskService;
import com.example.projectrmiweb.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class TaskController {
    @Autowired
    UploadFileService uploadFileService;

    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public String homepage() {
        return "/html/homepage";
    }

    @GetMapping("/task-list")
    public String getTaskList() {
        return "/html/task-list";
    }

    @GetMapping("/new-task")
    public String createTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "/html/create-task";
    }

    @PostMapping("/create-task")
    public ResponseEntity<?> createTask(Task task, @RequestParam("inputFile")MultipartFile inputFile, @RequestParam("methodFile")MultipartFile methodFile){
        String fileInputName = inputFile.getOriginalFilename();
        String fileMethodName = methodFile.getOriginalFilename();

        try{
            inputFile.transferTo(new File("E:\\USTH\\USTH_Lecture\\MI1.07 Programming Project - Pr. Lilian Aveneau\\ProjectRMi-web\\RMI\\InputData\\" + fileInputName));
            task.setInputFilePath("E:\\USTH\\USTH_Lecture\\MI1.07 Programming Project - Pr. Lilian Aveneau\\ProjectRMi-web\\RMI\\InputData\\" + fileInputName);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        try{
            methodFile.transferTo(new File("E:\\USTH\\USTH_Lecture\\MI1.07 Programming Project - Pr. Lilian Aveneau\\ProjectRMi-web\\RMI\\Calculation\\" + fileMethodName));
            task.setMethodFilePath("E:\\USTH\\USTH_Lecture\\MI1.07 Programming Project - Pr. Lilian Aveneau\\ProjectRMi-web\\RMI\\Calculation\\" + fileMethodName);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        taskService.save(task);
        return ResponseEntity.ok("Task create successfully.");
    }

    @GetMapping("/task-detail")
    public String getTask() {
        return "/html/task-detail";
    }
}
