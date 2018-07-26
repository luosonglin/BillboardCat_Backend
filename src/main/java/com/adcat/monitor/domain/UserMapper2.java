package com.adcat.monitor.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper2 {

    @Select("SELECT * FROM bmct_um_ui WHERE user_id = #{userId}")
    bmct_um_ui findById(@Param("userId") Long userId);
}
