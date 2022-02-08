package com.example.projectrmiweb.controller;

import com.example.projectrmiweb.dto.UserDto;
import com.example.projectrmiweb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class UserSignUpController {
    private UserService userService;

    public UserSignUpController(UserService userService){
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDto newUserDto(){
        return new UserDto();
    }

    @GetMapping
    public String showSignupPage(){
        return "html/signup";
    }

    @PostMapping
    public String signupUser(@ModelAttribute("user")UserDto newUser){
        userService.save(newUser);
        System.out.println(newUser.getFullName() + "/" + newUser.getEmail() + "/" + newUser.getPwd());
        return "redirect:/signup?success";
    }
}
