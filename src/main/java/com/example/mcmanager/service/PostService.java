package com.example.mcmanager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mcmanager.entity.Post;

import java.util.List;

public interface PostService extends IService<Post> {

    //查询所有帖子信息
    List<Post> getAllPost();

    //根据userid查询所有帖子信息
    List<Post> getAllPostById(Integer userid);

}