package com.wzxy.scientify.service;

import com.wzxy.scientify.entity.User;

import java.util.List;

public interface IUserService {
    public boolean login(User user);

    public boolean addUser(User user);

    @SuppressWarnings("rawtypes")
    public List getAllUser();

    public User getUserById(int userId);

    public boolean updateUser(User user);

    public boolean deleteUser(int userId);
}
