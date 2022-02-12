package com.example.projectrmiweb.service;

import com.example.projectrmiweb.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    User save(User user);
}
