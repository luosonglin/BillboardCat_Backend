package com.adcat.monitor.web;

import com.adcat.monitor.domain.Media;
import com.adcat.monitor.mapper.MediaMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/media")
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
    public Media getDetail(@RequestParam("id") long id) throws Exception {
        return mediaMapper.findById(id);
    }
}
