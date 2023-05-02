package com.example.mcmanager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mcmanager.entity.Likes;

import java.util.List;

public interface LikesService extends IService<Likes> {

    List<Likes> getAllLikes();

    List<Likes> getLikesByPostId(Integer post_id);
}