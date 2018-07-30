package com.adcat.monitor.web;

import com.adcat.monitor.domain.ReportMedia;
import com.adcat.monitor.mapper.ReportMediaMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/reportMedia")
@Valid
@Api(value = "媒体报备")
public class ReportMediaController {

    @Autowired
    ReportMediaMapper reportMediaMapper;

    @PutMapping(value = "")
    public String reportMedia(@RequestBody ReportMedia reportMedia) throws Exception {
        reportMediaMapper.reportMedia(reportMedia);
        return "success";
    }

    @GetMapping(value = "/{id}")
    public ReportMedia getReportMediaDetail(@PathVariable("id") Long id) throws Exception {
        return reportMediaMapper.getReportMediaDetail(id);
    }

    @GetMapping(value = "/my/reportMedia")
    public List<ReportMedia> getMyReportMediaList(@RequestParam Long userId) throws Exception {
        return reportMediaMapper.getMyReportMedia(userId);
    }
}
