package com.example.aop;

import com.example.aop.concert.Performance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author chenjing
 * @date 2020-01-30 20:01
 */
@SpringBootTest
public class AopTest {
    @Autowired
    Performance performance;

    @Test
    public void test(){
        performance.perform();
    }
}
