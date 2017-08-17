package com.yang.example.DAO.DAOimpl;

import com.yang.example.DAO.BaseDAO;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseDAOImpl<T> implements BaseDAO<T> {
    private Class<T> entityClass;
    public BaseDAOImpl(Class<T> clazz){
        this.entityClass = clazz;
    }

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void  insert(T t){
        sessionFactory.getCurrentSession().save(t);
    }

    @Override
    public void delete(T t){
        sessionFactory.getCurrentSession().delete(t);
    }

    @Override
    public void update(T t){
        sessionFactory.getCurrentSession().update(t);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T queryById(String id){
        return (T) sessionFactory.getCurrentSession().get(entityClass,id);
    }

    @Override
    public List<T> queryAll(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
        return criteria.list();
    }
}
