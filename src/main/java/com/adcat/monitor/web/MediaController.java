package com.adcat.monitor.web;

import com.adcat.monitor.domain.Area;
import com.adcat.monitor.domain.Media;
import com.adcat.monitor.domain.Style;
import com.adcat.monitor.mapper.MediaMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/${com.adcat.monitor.zhaopai.version}/media")
@Valid
@Api(value = "媒体")
public class MediaController {

    @Autowired
    MediaMapper mediaMapper;

    @GetMapping(value = "")
    public List<Media> getAllMedia() throws Exception {
        return mediaMapper.getAllMedia();
    }

    @GetMapping(value = "/{id}")
    public Media getDetail(@PathVariable("id") long id) throws Exception {
        return mediaMapper.findById(id);
    }

    @GetMapping(value = "/index")
    public List<Media> getIndexMedia() throws Exception {
        return mediaMapper.getIndexMedia();
    }

    @GetMapping(value = "/selected")
    public List<Media> getSelectedMedia() throws Exception {
        return mediaMapper.getSelectedMedia();
    }

    @GetMapping(value = "/query={wd}") //如用？，怎api报错，string的word无法转成long
    public List<Media> searchMediaByword(@PathVariable("wd") String wd) throws Exception {
        return mediaMapper.searchMediaByword(wd);
    }

    @GetMapping(value = "/my/{user_id}")
    public List<Media> getMyMedia(@PathVariable("user_id") long user_id) throws Exception {
        return mediaMapper.getMyMedia(user_id);
    }

    @GetMapping(value = "/area/{parent_id}")
    public List<Area> getArea(@PathVariable("parent_id") long parent_id) throws Exception {
        return mediaMapper.getArea(parent_id);
    }

    @GetMapping(value = "/style")
    public List<Style> getStyle() {
        return mediaMapper.getStyle();
    }

    @PostMapping(value = "")
    public Media addMedia(@RequestBody Media media) throws Exception {
        mediaMapper.insertMedia(media);

        return mediaMapper.findById(media.getId());
    }
}


