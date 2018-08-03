package com.wzxy.scientify.service.impl;

import com.wzxy.scientify.dao.IUserDao;
import com.wzxy.scientify.entity.User;
import com.wzxy.scientify.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
// 注入服务
public class UserServiceImpl implements IUserService {

    @Resource
    // 自动注入userdao，也可以使用@Autowired
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(User user) {
        // TODO Auto-generated method stub
        return this.userDao.login(user);
    }

    @Override
    public boolean addUser(User user) {
        // TODO Auto-generated method stub
        this.userDao.add(user);
        return true;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List getAllUser() {
        // TODO Auto-generated method stub
        return this.userDao.getUser();
    }

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.getUser(userId);
    }

    @Override
    public boolean updateUser(User user) {
        // TODO Auto-generated method stub
        this.userDao.update(user);
        return true;
    }

    @Override
    public boolean deleteUser(int userId) {
        // TODO Auto-generated method stub
        this.userDao.delete(userId);
        return true;
    }

}
