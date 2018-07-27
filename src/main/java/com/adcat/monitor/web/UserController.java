package com.adcat.monitor.web;

import com.adcat.monitor.domain.User;
import com.adcat.monitor.domain.UserTest;
import com.adcat.monitor.exception.JsonException;
import com.adcat.monitor.mapper.UserMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/${com.adcat.monitor.zhaopai.version}/user")
@Validated
@Api(value = "个人")
public class UserController {

    @Autowired
    UserMapper userMapper;

    // 创建线程安全的Map
    static Map<Long, UserTest> users = Collections.synchronizedMap(new HashMap<Long, UserTest>());

    //    @ApiOperation(value="获取用户详细信息")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "long")
    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") Long id) throws Exception {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return userMapper.findById(id);
    }

    @PostMapping(value = "")
    public User login(@RequestParam String phone, @RequestParam String code, @RequestParam int type) throws Exception {

        //老用户，直接登录
        if (userMapper.isExist(phone) != null)
            return userMapper.findByPhone(phone);

        //新用户，注册登录
        User user = new User();
        user.setPhoneNum(phone);
        user.setGroupid(type);
        user.setFirstEntryTime(new Date(System.currentTimeMillis()));
        user.setName("一只小牌猫" + phone.substring(7, 11));
        userMapper.insertUser(user);

        return userMapper.findByPhone(phone);
    }

    @PutMapping(value = "/{id}")
    public User update(@RequestBody User user) throws Exception {
        if (userMapper.isExist(user.getPhoneNum()) == null)
            throw new JsonException("该用户不存在");

        User user2 = userMapper.findByPhone(user.getPhoneNum());
        user2.setProperty(user.getProperty());
        //user2.setGroupid(user.getGroupid()); //该字段很重要，暂时不提供修改
        user2.setName(user.getName());

        user2.setProvince(user.getProvince());
        user2.setCity(user.getCity());
        user2.setCounty(user.getCounty());

        user2.setLastModifyTime(new Date(System.currentTimeMillis()));
        user2.setAvatar(user.getAvatar());

        userMapper.update(user2);

        return userMapper.findByPhone(user.getPhoneNum());
    }

}
