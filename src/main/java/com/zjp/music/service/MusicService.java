package com.zjp.music.service;

import com.zjp.music.entity.Song;

import java.util.List;

public interface MusicService {
    List<Song> selectAll();
}
