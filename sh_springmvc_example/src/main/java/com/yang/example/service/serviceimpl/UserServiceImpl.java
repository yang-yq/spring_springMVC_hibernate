package com.yang.example.service.serviceimpl;

import com.yang.example.DAO.UserDao;
import com.yang.example.entity.User;
import com.yang.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//对实现加上注释@Service，这是在告诉spring，我需要你来管理我。Transactional就是指明每个方法是一个事务。
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void saveUsers(List<User> users) {
        for (User user:users){
            userDao.insert(user);
        }
    }

    public List<User> getAllUsernames() {
        return userDao.queryAll();
    }

//    测试spring
//    public List<String> getAllUsernames() {
//        List<String> users = new ArrayList<String>();
//        users.add("yang");
//        users.add("yin");
//        users.add("qi");
//        return users;
//    }
}
