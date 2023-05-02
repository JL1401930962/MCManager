package com.example.mcmanager.controller;

import com.example.mcmanager.entity.Likes;
import com.example.mcmanager.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LikesController {

    @Autowired
    private LikesService likesService;

    // 获取所有点赞信息
    @GetMapping("/getAllLikes")
    public List<Likes> getAllLikes(){
        return likesService.getAllLikes();
    }

    // 根据post_id获取点赞信息
    @GetMapping("/getLikesByPostId")
    public List<Likes> getLikesByPostId(Integer post_id){
        return likesService.getLikesByPostId(post_id);
    }


}
