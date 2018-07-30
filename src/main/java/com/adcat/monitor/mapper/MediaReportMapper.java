package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MediaReportMapper {
    @Insert("INSERT INTO `bmct_um_ui` (`name`, `groupid`, `phone_num`, `first_entry_time`)\n" +
            "VALUES" +
            "(#{name},#{groupid},#{phoneNum},#{firstEntryTime})")
    int insertUser(User user);

}
