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

    @Select("select * from bmct_mi_media where is_show =1")
    List<Media> getIndexMedia(); //首页展示

    @Select("select * from bmct_mi_media where is_paid = 1")
    List<Media> getSelectedMedia();

    // mybatis的like语句运用不同于mysql的
    // mysql：   select * from bmct_mi_media where name like '%#{word}%'
    // mybatis： select * from bmct_mi_media where name like CONCAT('%','${word}','%' )
    @Select("select * from bmct_mi_media where name like CONCAT('%','${word}','%' ) ")
    List<Media> getMediaByWord(@Param("word") String word);
}
