package com.adcat.monitor.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM bmct_um_ui WHERE user_id = #{userId}")
    User findById(@Param("userId") Long userId);

    @Select("SELECT * FROM bmct_um_ui WHERE phone_num = #{phone_num}")
    User findByPhone(@Param("phone_num") String phone);

    @Insert("INSERT INTO `bmct_um_ui` (`user_id`, `property`, `password`, `name`, `groupid`, `phone_num`, `concern_area`, `status`, `user_status`, `province`, `city`, `county`, `first_entry_time`, `last_modify_time`, `media_status`, `avatar`)\n" +
            "VALUES" +
            "(#{user_id},#{property},#{password},#{name},#{groupid},#{phone_num},#{concern_area},#{status},#{user_status},#{province},#{city},#{county},#{first_entry_time},#{last_modify_time},#{media_status},#{avatar})")
    int insertUser(User user);
}
