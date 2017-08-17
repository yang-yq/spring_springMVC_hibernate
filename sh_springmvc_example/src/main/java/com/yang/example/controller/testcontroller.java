package com.yang.example.controller;

import com.yang.example.entity.User;
import com.yang.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class testcontroller {
    //定义全局变量usrService
    @Autowired
    private UserService userService;
    // 这里要注意的是Autowire这个annotation，它是为了告诉spring，这个对象没有实例化，需要注入一个UserService的实例，
    // 可是问题是，UserSerivce是一个接口，如果不指定就不知道你想用哪个实现类，Spring会首先看自己的容器里有没有一个叫做userService的对象
    // （刚才创建的UserServiceImpl的对象名字就叫做userServiceImpl），如果找不到就在配置文件里配置的路径下面寻找UserService的实现类，
    // 找到了就把它的对象拿过来.除此之外刚才Service那个annotation还可以指 定一个value：@Service("userService")。
    // 这样一来，对于UserServiceImpl这个类的实例，Spring给它起的名字就不是userServiceImpl了，而是userService


    @RequestMapping("/insert")
    public String index(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("hello");
        us.add(u);
        u = new User();
        u.setUsername("world");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/testjson")
    @ResponseBody
    public List<User> test(){
        return userService.getAllUsernames();
    }

//    用来测试springMVC的代码
//    public Map<String,String> test(){
//        Map<String,String> result = new HashMap<String, String>();
//        result.put("name","yang");
//        result.put("test","helloworld");
//        return result;
//    }

}

