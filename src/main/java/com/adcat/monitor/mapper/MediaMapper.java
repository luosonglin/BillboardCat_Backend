package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.Area;
import com.adcat.monitor.domain.Media;
import com.adcat.monitor.domain.Style;
import com.adcat.monitor.domain.User;
import org.apache.ibatis.annotations.Insert;
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
    @Select("SELECT * FROM `bmct_mi_media` WHERE CONCAT(IFNULL(`name`,''),IFNULL(`location`,''),IFNULL(`style`,'')) like CONCAT('%','${word}','%' ) ")
    List<Media> searchMediaByword(@Param("word") String word);

    @Select("select * from bmct_mi_media where user_id = #{user_id}")
    List<Media> getMyMedia(@Param("user_id") Long id);


    @Select("select * from bmct_area where parent_id = #{parent_id} order by sort asc")
    List<Area> getArea(@Param("parent_id") Long parent_id);

    @Select(("select * from bmct_mi_style"))
    List<Style> getStyle();


    @Insert("INSERT INTO `bmct_mi_media` (`status`, `name`, `url`, `is_paid`," +
            " `is_use`, `longitude`, `laitude`, `location`, `img_location`, " +
            "`img_live`, `img_adver_card`, `img_plan_card`, `media_company`, " +
            "`style`, `size`, `lighting_time`, `flow`, `price`," +
            " `data`, `if_camera`, `camera_id`, `type`, `user_id`, `user_name`, `if_map_online`)\n" +
            "VALUES" +
            "(#{status},#{name},#{url},#{is_paid}," +
            "#{is_use},#{longitude},#{laitude},#{location},#{img_location}," +
            "#{img_live},#{img_adver_card},#{img_plan_card},#{media_company}," +
            "#{style},#{size},#{lighting_time},#{flow},#{price}," +
            "#{data},#{if_camera},#{camera_id},#{type},#{user_id},#{user_name},#{if_map_online})")
    int insertMedia(Media media);


}
