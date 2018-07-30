package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.SearchMedia;
import com.adcat.monitor.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface SearchMediaMapper {

    @Insert("INSERT INTO `bmct_search_media` (`user_id`, `product_name`, `belong_industry`, `media_ways`, `put_time_start`, `put_time_end`, `put_position`, `put_information`, `put_budget`)\n" +
            "VALUES" +
            "(#{userId},#{productName},#{belongIndustry},#{mediaWays},#{putTimeStart},#{putTimeEnd},#{putPosition},#{putInformation},#{putBudget})")
    int searchMediaTable(SearchMedia searchMedia);


    @Select("select * from bmct_search_media WHERE id = #{id}")
    SearchMedia getSearchMediaTableDetail(@Param("id") Long id);


    @Select("select * from bmct_search_media WHERE user_id = #{userId}")
    List<SearchMedia> getMySearchMedia(@Param("userId") Long userId);
}
