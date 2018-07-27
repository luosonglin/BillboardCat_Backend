package com.adcat.monitor.mapper;

import com.adcat.monitor.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM bmct_um_ui WHERE user_id = #{userId}")
    User findById(@Param("userId") Long userId);

    @Select("SELECT * FROM bmct_um_ui WHERE phone_num = #{phone_num}")
    User findByPhone(@Param("phone_num") String phone);

    @Insert("INSERT INTO `bmct_um_ui` (`name`, `groupid`, `phone_num`, `first_entry_time`)\n" +
            "VALUES" +
            "(#{name},#{groupid},#{phoneNum},#{firstEntryTime})")
    int insertUser(User user);

    @Select("select 1 from bmct_um_ui where phone_num = #{phone_num} limit 1")
    Object isExist(@Param("phone_num") String phone);

    //更新用户信息（除了修改手机号）
    @Update("UPDATE bmct_um_ui SET property=#{property}, name=#{name}, groupid=#{groupid}, " +
            "province=#{province}, city=#{city}, county=#{county}, " +
            "last_modify_time=#{lastModifyTime},  avatar=#{avatar} " +
            "WHERE phone_num=#{phoneNum}")
    void update(User user);
}
