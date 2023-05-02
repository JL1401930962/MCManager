package com.example.mcmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mcmanager.entity.Likes;
import com.example.mcmanager.entity.User;
import com.example.mcmanager.mapper.LikesMapper;
import com.example.mcmanager.mapper.UserMapper;
import com.example.mcmanager.service.LikesService;
import com.example.mcmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikesServiceImpl extends ServiceImpl<LikesMapper, Likes>
        implements LikesService {

    @Autowired
    LikesMapper likesMapper;

    @Override
    public List<Likes> getAllLikes() {
        return likesMapper.getAllLikes();
    }

    @Override
    public List<Likes> getLikesByPostId(Integer post_id) {
        return likesMapper.getLikesByPostId(post_id);
    }
}