package com.example.mcmanager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mcmanager.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostMapper extends BaseMapper<Post> {
    //查询所有帖子信息
    List<Post> getAllPost();

    //根据userid查询所有帖子信息
    List<Post> getAllPostById(Integer userid);
}
