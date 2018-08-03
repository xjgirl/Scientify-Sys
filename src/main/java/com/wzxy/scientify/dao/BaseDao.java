package com.wzxy.scientify.dao;

import com.wzxy.scientify.utils.IPage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BaseDao {
    /**
     * 保存一个对象
     * @param o
     * @return
     */
    public Serializable save(Object o);

    /**
     * 删除一个对象
     * @param o
     */
    public void delete(Object o);

    /**
     * 更新一个对象
     * @param o
     */
    public void update(Object o);

    /**
     * 保存或更新对象
     * @param o
     */
    public void saveOrUpdate(Object o);
    public <T> List<T> getAll(Class<T> cla);

    /**
     * 查询集合
     * @param hql
     * @param param
     * @param <T>
     * @return
     */
    public <T> List<T> find(String hql, Object...param);

    /**
     * 查询集合带缓存
     * @param hql
     * @param param
     * @param <T>
     * @return
     */
    public <T> List<T> findCache(String hql, Object...param);

    /**
     * 查询集合
     * @param hql
     * @param map
     * 集合参数
     * @param param
     * @param <T>
     * @param <K>
     * @return
     */
    public <T, K> List<T> find(String hql, Map<String, List<K>> map, Object...param);

    /**
     * 分页查询
     * @param hql
     * @param map
     * @param page
     * @param param
     * @param <T>
     * @param <K>
     * @return
     */
    public <T, K> List<T> findByPage(String hql, Map<String, List<K>> map, IPage page, Object... param);

    /**
     * 查询集合（带分页）
     * @param hql
     * @param page
     * @param param
     * @param <T>
     * @return
     */
    public <T> List<T> findByPage(String hql, IPage page, Object...param);

    /**
     * 获得一个对象
     * @param c
     * @param id
     * @param <T>
     * @return
     */
    public <T> T get(Class<T> c, Serializable id);

    /**
     * 获得一个对象
     * @param c
     * @param id
     * @param <T>
     * @return
     */
    public <T> T load(Class<T> c, Serializable id);

    /**
     * 获得一个对象
     * @param hql
     * @param param
     * @param <T>
     * @return
     */
    public <T> T getOne(String hql, Object...param);

    /**
     * select count(*) from
     * @param hql
     * @param param
     * @return
     */
    public Long count(String hql, Object...param);

    /**
     * 查询记录数
     * @param hql
     * @param map
     * @param param
     * @param <T>
     * @return
     */
    public <T> Long count (String hql, Map<String, List<T>> map, Object...param);

    /**
     * 执行hql语句
     * @param hql
     * @param param
     * @return 响应数目
     */
    public Integer executeHql(String hql, Object...param);

    /**
     * 批量添加实体信息
     * @param list
     * @param <T>
     * @throws Exception
     */
    public <T> void batchAddEnity(final List<T> list) throws  Exception;
    public <T> void batchDeleteEnity(final List<T> list) throws Exception;

    /**
     * 批量添加实体信息
     *
     * @param <T>
     * @param list
     * @throws Exception
     */
    public <T> void batchSaveEnity(final Set<T> list) throws Exception;

    /**
     * 执行增删改操作
     *
     * @param hql
     * @param map
     * @param param
     * @author
     *
     * @return
     */
    public <T> Integer executeHql(String hql, Map<String, List<T>> map, Object... param);

    public <T, K> List<T> findByPageAndSql(String sql, Class<T> cls, Map<String, List<K>> map, IPage page, Object... param);

    public <T, K> List<T> findByPageAndSql(String sql, Class<T> cls, IPage page, Object... param);

    public <T> Long countSql(String sql, Map<String, List<T>> map, Object... param);

    public <T> Long countSql(String sql, Object... param);

    public void delete(Class<?> cla, Long... ids);
}
