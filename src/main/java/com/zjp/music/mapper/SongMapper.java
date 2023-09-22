package com.zjp.music.mapper;

import com.zjp.music.entity.Song;

import java.util.List;

public interface SongMapper {
    List<Song> selectAll();
}
