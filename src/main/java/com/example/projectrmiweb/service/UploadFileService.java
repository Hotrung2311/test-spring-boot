package com.example.projectrmiweb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadFileService {
    public void uploadFile(MultipartFile file) throws IOException {
        file.transferTo(new File("E:\\USTH\\USTH_Lecture\\MI1.07 Programming Project - Pr. Lilian Aveneau\\ProjectRMi-web\\inputFile" + file.getOriginalFilename()));
    }
}
