package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.Media;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface MediaMapper {

    @Select("select * from bmct_mi_media")
    List<Media> getAllMedia();

    @Select("SELECT * FROM bmct_mi_media WHERE id = #{id}")
    Media findById(@Param("id") Long id);
}
