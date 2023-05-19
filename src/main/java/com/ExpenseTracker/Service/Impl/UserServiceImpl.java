package com.ExpenseTracker.Service.Impl;

import com.ExpenseTracker.Service.UserService;
import com.ExpenseTracker.entity.User;
import com.ExpenseTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User loginUser(User user) {
        return null;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }
}
