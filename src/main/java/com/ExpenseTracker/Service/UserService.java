package com.ExpenseTracker.Service;

import com.ExpenseTracker.entity.User;

public interface UserService {

    User registerUser(User user);
    User loginUser(User user);
    User getUser(Integer id);

}
