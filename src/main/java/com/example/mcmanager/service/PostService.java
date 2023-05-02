package com.example.mcmanager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mcmanager.entity.Post;

import java.util.List;
import java.util.Map;

public interface PostService extends IService<Post> {

    //查询所有帖子信息
    List<Post> getAllPost();

    //根据userid查询所有帖子信息
    List<Post> getAllPostById(Integer userid);

    // 添加帖子
    String addPost(Post post);

    Integer getSongIdByPostId(Integer post_id);
}