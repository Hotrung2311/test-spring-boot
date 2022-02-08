package com.example.projectrmiweb.dto;

public class UserDto {
    private String fullName;
    private String email;
    private String pwd;

    public UserDto() {
    }

    public UserDto(String fullName, String email, String pwd) {
        this.fullName = fullName;
        this.email = email;
        this.pwd = pwd;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
