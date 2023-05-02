package com.example.mcmanager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mcmanager.entity.Likes;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikesMapper extends BaseMapper<Likes> {

    List<Likes> getAllLikes();

    List<Likes> getLikesByPostId(Integer post_id);
}
