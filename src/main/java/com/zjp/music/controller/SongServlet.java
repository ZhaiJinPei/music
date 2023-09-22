package com.zjp.music.controller;

import com.zjp.music.entity.Song;
import com.zjp.music.service.MusicService;
import com.zjp.music.service.impl.MusicServiceImpl;
import com.zjp.music.utils.ResponseUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

@WebServlet("/music/*")
@Slf4j
public class SongServlet extends HttpServlet {
    private final MusicService musicService = new MusicServiceImpl();

    public SongServlet() {
        log.info("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        log.info(requestURI);
        int position = requestURI.lastIndexOf("/");
        String method = requestURI.substring(position + 1);
        log.info(method);
        switch (method) {
            case "list" -> {
                selectList(req, resp);
            }
            case "add" -> {
                add(req, resp);
            }
        }
    }

    private void selectList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResponseUtils responseUtils;
        List<Song> songs = musicService.selectAll();
        responseUtils = new ResponseUtils().put("list", songs);
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().println(responseUtils.toJsonString());
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Adding");
    }

    @Override
    public void destroy() {
        log.info("destroy");
    }
}
