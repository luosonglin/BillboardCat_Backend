package com.adcat.monitor.web;

import com.adcat.monitor.domain.Media;
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
}
