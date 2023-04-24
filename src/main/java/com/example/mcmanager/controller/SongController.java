package com.example.mcmanager.controller;

import com.example.mcmanager.entity.Song;
import com.example.mcmanager.entity.User;
import com.example.mcmanager.service.SongService;
import com.example.mcmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/song")
@CrossOrigin
public class SongController {

    @Autowired
    private UserService userService;

    // songService
    @Autowired
    private SongService songService;


    /**
     * 接口：获取信息
     * @return
     */
    @PostMapping("list1")
    public List<Song> list(){
        return songService.list();
    }




}
