package com.example.projectrmiweb.service.impl;

import com.example.projectrmiweb.model.User;
import com.example.projectrmiweb.model.CustomUserDetails;
import com.example.projectrmiweb.repository.UserRepository;
import com.example.projectrmiweb.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Kiểm tra xem user có tồn tại trong database không?
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
