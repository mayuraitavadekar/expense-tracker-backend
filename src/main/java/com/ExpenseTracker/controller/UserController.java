package com.ExpenseTracker.controller;

import com.ExpenseTracker.Service.UserService;
import com.ExpenseTracker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    ResponseEntity<User> registerUser(@RequestBody User user) {
        User u1 = this.userService.registerUser(user);
        return new ResponseEntity<>(u1, HttpStatus.OK);
    }

    @GetMapping("/hello-world")
    public String hellWorld() {
        return "hello world";
    }
}
