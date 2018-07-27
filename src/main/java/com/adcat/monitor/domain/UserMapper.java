package com.adcat.monitor.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM bmct_um_ui WHERE user_id = #{userId}")
    User findById(@Param("userId") Long userId);
}
