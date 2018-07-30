package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.ReportMedia;
import com.adcat.monitor.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReportMediaMapper {
    @Insert("INSERT INTO `bmct_mi_rl` (`customer_name`, `belong_industry`, `media_name`, `delivery_period`, `report_media`, `report_person`, `alarm_time`, `user_id`, `put_time_start`, `put_time_end`)\n" +
            "VALUES" +
            "(#{customerName},#{belongIndustry},#{mediaName},#{deliveryPeriod},#{reportMedia},#{reportPerson},#{alarmTime},#{userId},#{putTimeStart},#{putTimeEnd})")
    int reportMedia(ReportMedia reportMedia);

    @Select("select * from bmct_mi_rl WHERE report_id = #{id}")
    ReportMedia getReportMediaDetail(@Param("id") Long id);

    @Select("select * from bmct_mi_rl WHERE user_id = #{userId}")
    List<ReportMedia> getMyReportMedia(@Param("userId") Long userId);


}
