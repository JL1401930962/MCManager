package com.example.mcmanager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mcmanager.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper extends BaseMapper<User> {
    //查询所有用户
    List<User> getAllUser();

    //根据id查询用户
    User getUserById(Integer userid);

}