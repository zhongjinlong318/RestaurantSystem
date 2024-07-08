package com.msr;

import com.msr.bean.User;
import com.msr.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantSystemApplication.class)
class RestaurantSystemApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testMapper(){
        User user = new User();
        user.setUsername("八戒");
        user.setPassword("admin123");
        userMapper.login(user);
    }
}
