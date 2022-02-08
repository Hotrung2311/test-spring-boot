package com.example.projectrmiweb.repository;

import com.example.projectrmiweb.dto.UserDto;
import com.example.projectrmiweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
