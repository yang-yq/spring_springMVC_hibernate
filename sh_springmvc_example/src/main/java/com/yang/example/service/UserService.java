package com.yang.example.service;

import com.yang.example.entity.User;

import java.util.List;

public interface UserService {
    public void saveUsers(List<User> users);
    public List<User> getAllUsernames();
}