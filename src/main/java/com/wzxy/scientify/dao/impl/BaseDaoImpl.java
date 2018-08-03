package com.wzxy.scientify.dao.impl;

import com.wzxy.scientify.dao.BaseDao;
import com.wzxy.scientify.utils.IPage;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import java.util.Set;

@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {
    @Autowired
    private @Qualifier("sessionFactory") SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private void flushAndClear(){
        this.sessionFactory.getCurrentSession().flush();
        this.sessionFactory.getCurrentSession().clear();
    }
    @Override
    public Serializable save(Object o) {
        return this.sessionFactory.getCurrentSession().save(o);
    }

    @Override
    public void delete(Object o) {
        this.sessionFactory.getCurrentSession().delete(o);
        this.sessionFactory.getCurrentSession().flush();
    }

    @Override
    public void update(Object o) {
        this.sessionFactory.getCurrentSession().update(o);
        this.sessionFactory.getCurrentSession().flush();
    }


    @Override
    public void saveOrUpdate(Object o) {
        this.sessionFactory.getCurrentSession().saveOrUpdate(o);
        this.sessionFactory.getCurrentSession().flush();
    }

    @Override
    public <T> List<T> getAll(Class<T> cla) {
        return null;
    }

    @Override
    public <T> List<T> find(String hql, Object... param) {
        return null;
    }

    @Override
    public <T> List<T> findCache(String hql, Object... param) {
        return null;
    }

    @Override
    public <T, K> List<T> find(String hql, Map<String, List<K>> map, Object... param) {
        return null;
    }

    @Override
    public <T, K> List<T> findByPage(String hql, Map<String, List<K>> map, IPage page, Object... param) {
        return null;
    }

    @Override
    public <T> List<T> findByPage(String hql, IPage page, Object... param) {
        return null;
    }

    @Override
    public <T> T get(Class<T> c, Serializable id) {
        return null;
    }

    @Override
    public <T> T load(Class<T> c, Serializable id) {
        return null;
    }

    @Override
    public <T> T getOne(String hql, Object... param) {
        return null;
    }

    @Override
    public Long count(String hql, Object... param) {
        return null;
    }

    @Override
    public <T> Long count(String hql, Map<String, List<T>> map, Object... param) {
        return null;
    }

    @Override
    public Integer executeHql(String hql, Object... param) {
        return null;
    }

    @Override
    public <T> void batchAddEnity(List<T> list) throws Exception {

    }

    @Override
    public <T> void batchDeleteEnity(List<T> list) throws Exception {

    }

    @Override
    public <T> void batchSaveEnity(Set<T> list) throws Exception {

    }

    @Override
    public <T> Integer executeHql(String hql, Map<String, List<T>> map, Object... param) {
        return null;
    }

    @Override
    public <T, K> List<T> findByPageAndSql(String sql, Class<T> cls, Map<String, List<K>> map, IPage page, Object... param) {
        return null;
    }

    @Override
    public <T, K> List<T> findByPageAndSql(String sql, Class<T> cls, IPage page, Object... param) {
        return null;
    }

    @Override
    public <T> Long countSql(String sql, Map<String, List<T>> map, Object... param) {
        return null;
    }

    @Override
    public <T> Long countSql(String sql, Object... param) {
        return null;
    }

    @Override
    public void delete(Class<?> cla, Long... ids) {

    }
}
