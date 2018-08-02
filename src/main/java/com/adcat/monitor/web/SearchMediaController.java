package com.adcat.monitor.web;

import com.adcat.monitor.domain.SearchMedia;
import com.adcat.monitor.dto.ResponseData;
import com.adcat.monitor.mapper.SearchMediaMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/${com.adcat.monitor.zhaopai.version}/searchMedia")
@Api(value = "寻找媒体")
@Valid
public class SearchMediaController {

    @Autowired
    SearchMediaMapper searchMediaMapper;

    @PutMapping(value = "")
    public String commitSearchMediaTable(@RequestBody SearchMedia searchMedia) throws Exception {
        searchMediaMapper.searchMediaTable(searchMedia);
        return "success";
    }


    @GetMapping(value = "/my/searchMediaTable")
    public List<SearchMedia> getMySearchMediaTable(@RequestParam Long userId) throws Exception {
        return searchMediaMapper.getMySearchMedia(userId);
    }


    @GetMapping(value = "/{id}")
    public SearchMedia getSearchMediaDeatil(@PathVariable("id") Long id) throws Exception {
        return searchMediaMapper.getSearchMediaTableDetail(id);
    }
}
