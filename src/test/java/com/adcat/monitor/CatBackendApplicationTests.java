package com.adcat.monitor;

import com.adcat.monitor.domain.UserTest;
import com.adcat.monitor.domain.UserMapperTest;
import com.adcat.monitor.service.BlogProperties;
import com.adcat.monitor.web.HelloController;
import com.adcat.monitor.web.UserControllerTest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CatBackendApplicationTests {

    private static final Log log = LogFactory.getLog(CatBackendApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Autowired
    private BlogProperties blogProperties;


    @Test
    public void getNumber() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "luosonglin");
//        Assert.assertEquals(blogProperties.getTitle(), "大牌监测猫");

        log.info(blogProperties.getTitle());
        log.info("随机数测试输出：");
        log.info("随机字符串 : " + blogProperties.getValue());
        log.info("随机int : " + blogProperties.getNumber());
        log.info("随机long : " + blogProperties.getBignumber());
        log.info("随机10以下 : " + blogProperties.getTest1());
        log.info("随机10-20 : " + blogProperties.getTest2());
    }


    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(
                new HelloController(),
                new UserControllerTest()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }

    @Test
    public void testUserController() throws Exception {
//  	测试UserController
        RequestBuilder request = null;

        // 1、get查一下user列表，应该为空
        request = get("/users/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        // 2、post提交一个user
        request = post("/users/")
                .param("id", "1")
                .param("name", "测试大师")
                .param("age", "20");
        mvc.perform(request)
//				.andDo(MockMvcResultHandlers.print())
                .andExpect(content().string(equalTo("success")));

        // 3、get获取user列表，应该有刚才插入的数据
        request = get("/users/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));

        // 4、put修改id为1的user
        request = put("/users/1")
                .param("name", "测试终极大师")
                .param("age", "30");
        mvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 5、get一个id为1的user
        request = get("/users/1");
        mvc.perform(request)
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));

        // 6、del删除id为1的user
        request = delete("/users/1");
        mvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 7、get查一下user列表，应该为空
        request = get("/users/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));
    }


    @Autowired
    private UserMapperTest userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("罗崧麟", 20);
        UserTest u = userMapper.findByName("罗崧麟");
        Assert.assertEquals(20, u.getAge().intValue());
    }

    @Test
    @Rollback
    public void deleteById() throws Exception {
        for (int i = 4; i >= 0; i--)
            userMapper.delete(i);
    }

}
