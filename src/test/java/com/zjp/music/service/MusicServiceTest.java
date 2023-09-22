package com.zjp.music.service;

import com.zjp.music.entity.Song;
import com.zjp.music.service.impl.MusicServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class MusicServiceTest {
    private final MusicService musicService = new MusicServiceImpl();

    @Test
    void selectAll() {
        List<Song> songs = musicService.selectAll();
        songs.forEach(song -> log.info(String.valueOf(song)));
    }
}