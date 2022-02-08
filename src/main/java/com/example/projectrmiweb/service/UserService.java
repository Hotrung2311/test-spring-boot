package com.example.projectrmiweb.service;

import com.example.projectrmiweb.dto.UserDto;
import com.example.projectrmiweb.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserDto userDto);
}
