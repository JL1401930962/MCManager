package com.example.mcmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mcmanager.entity.User;
import com.example.mcmanager.mapper.UserMapper;
import com.example.mcmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {


    @Autowired
    UserMapper userMapper;

    //查询所有用户
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    //根据id查询用户
    @Override
    public User getUserById(Integer userid) {
        System.out.println(userid);
        return userMapper.getUserById(userid);
    }


}