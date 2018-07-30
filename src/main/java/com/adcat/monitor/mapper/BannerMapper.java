package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BannerMapper {

    @Select("select * from bmct_multi_pictures")
    Banner getBanner();
}
