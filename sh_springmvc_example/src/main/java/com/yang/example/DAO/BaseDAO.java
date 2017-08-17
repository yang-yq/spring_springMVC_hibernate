package com.yang.example.DAO;

import java.util.List;

//实现了基本的CRUD操作，然后让其他的DAO来继承这个基类，这样相同的CRUD操作我们直接使用父类的方法就可以了
public interface BaseDAO<T> {
    T queryById(String id);
    List<T> queryAll();
    void insert(T t);
    void delete(T t);
    void update(T t);
}