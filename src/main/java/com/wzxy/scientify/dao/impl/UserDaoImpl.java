package com.wzxy.scientify.dao.impl;

import com.wzxy.scientify.dao.IUserDao;
import com.wzxy.scientify.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Transactional(rollbackFor = Exception.class)
// 出现Exception异常回滚
@Repository("userDao")
// 进行注入
public class UserDaoImpl implements IUserDao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings({ "unchecked" })

    public boolean login(User user) {
        Iterator<User> it;
        String hql = "from User u where u.userId=? and u.password=?";
        Query query;
        query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, user.getUserId());
        query.setString(1, user.getPassword());
        it = query.iterate();
        if (it.hasNext()) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("rawtypes")
    public List getUser() {
        // TODO Auto-generated method stub
        return sessionFactory.getCurrentSession().createQuery("from User")
                .list();
    }


    public User getUser(int userId) {
        // TODO Auto-generated method stub
        return (User) sessionFactory.getCurrentSession()
                .get(User.class, userId);
    }


    public void add(User user) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().save(user);
    }

    public void update(User user) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().update(user);
    }

    public void delete(int userId) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().get(User.class, userId);
    }
}
