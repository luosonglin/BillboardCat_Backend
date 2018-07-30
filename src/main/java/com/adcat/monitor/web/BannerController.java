package com.adcat.monitor.web;

import com.adcat.monitor.domain.Banner;
import com.adcat.monitor.mapper.BannerMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/banner")
@Valid
@Api(value = "Banner")
public class BannerController {

    @Autowired
    BannerMapper bannerMapper;

    @GetMapping(value = "")
    public Banner getBanner() throws Exception {
        return bannerMapper.getBanner();
    }
}
