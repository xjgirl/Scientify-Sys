package com.wzxy.scientify.dao;
import com.wzxy.scientify.entity.User;
import java.util.List;

public interface IUserDao {
    /**
     * 登录
     */
    public boolean login(User user);

    /**
     * 获取用户列表
     */
    @SuppressWarnings("rawtypes")
    public List getUser();

    /**
     * 根据用户id获取用户信息
     *
     * @param userId
     * @return
     */
    public User getUser(int userId);

    /**
     * 添加并保存用户
     *
     * @param user
     */
    public void add(User user);

    /**
     * 更新用户信息
     *
     * @param user
     */
    public void update(User user);

    /**
     * 根据用户id删除用户信息
     *
     * @param userId
     */
    public void delete(int userId);
}
