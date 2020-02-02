package com.example.aopclient;

import com.example.aop.concert.Audience;
import com.example.aop.concert.Performance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author chenjing
 * @date 2020-01-30 20:36
 */
@SpringBootTest
public class ClientTest {
    @Autowired
    Audience audience;

    @Test
    public void test() {
        System.out.println(audience);
    }
}
