package com.adcat.monitor.web;

import com.adcat.monitor.domain.User;
import com.adcat.monitor.domain.UserMapper2;
import com.adcat.monitor.domain.bmct_um_ui;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/${com.adcat.monitor.zhaopai.version}/user")
@Validated
@Api(value = "个人")
public class UserController2 {

    @Autowired
    UserMapper2 userMapper2;

    // 创建线程安全的Map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

//    @ApiOperation(value="获取用户详细信息")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "long")
    @GetMapping(value = "/{id}")
    public bmct_um_ui getUser(@PathVariable("id") Long id) throws Exception{
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return userMapper2.findById(id);
    }

}
