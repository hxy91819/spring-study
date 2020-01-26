package com.example.mybatisplusbatch.mp.common.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusbatch.mp.common.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author chenjing
 * @date 2020-01-26 23:26
 */
@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){
        User user = userMapper.selectOne(
                new QueryWrapper<User>().lambda()
                .eq(User::getId, 1L)
        );
        System.out.println(user);
    }
}