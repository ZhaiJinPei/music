package com.zjp.music.service.impl;

import com.zjp.music.entity.Song;
import com.zjp.music.mapper.SongMapper;
import com.zjp.music.service.MusicService;
import com.zjp.music.utils.MyBatisUtils;

import java.util.List;

public class MusicServiceImpl implements MusicService {
    @Override
    public List<Song> selectAll() {
        return (List<Song>) MyBatisUtils.executeQuery(sqlSession -> {
            SongMapper mapper = sqlSession.getMapper(SongMapper.class);
            return mapper.selectAll();
        });
    }
}
