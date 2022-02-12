package com.example.projectrmiweb;

import com.example.projectrmiweb.model.User;
import com.example.projectrmiweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProjectRMiWebApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(ProjectRMiWebApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Khi chương trình chạy
        // Insert vào csdl một user.
//        User user = new User();
//        user.setUsername("trung@gmail.com");
//        user.setPassword(passwordEncoder.encode("123"));
//        userRepository.save(user);
//        System.out.println(user);
    }
}
