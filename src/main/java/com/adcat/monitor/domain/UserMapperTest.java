package com.adcat.monitor.domain;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapperTest {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    UserTest findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("delete from user where id=#{id}")
    void delete(@Param("id") long id);
}
