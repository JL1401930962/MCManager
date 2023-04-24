package com.example.mcmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mcmanager.entity.Song;
import com.example.mcmanager.mapper.SongMapper;
import com.example.mcmanager.service.SongService;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl extends ServiceImpl<SongMapper, Song>
        implements SongService {

}