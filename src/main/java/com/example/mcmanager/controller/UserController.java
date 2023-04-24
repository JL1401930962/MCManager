package com.example.mcmanager.controller;

import com.example.mcmanager.entity.Post;
import com.example.mcmanager.entity.User;
import com.example.mcmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${file.upload.path}")
    private String filePath;

    /**显示虚拟地址*/
    @Value("${file.upload.relative}")
    private String fileRelativePath;

    /**
     * 接口：获取信息
     * @return
     */
    @PostMapping("list1")
    public List<User> list(){
        return userService.list();
    }



}
