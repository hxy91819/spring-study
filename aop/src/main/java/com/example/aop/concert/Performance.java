package com.example.aop.concert;

import org.springframework.stereotype.Component;

/**
 * @author chenjing
 * @date 2020-01-30 19:33
 */
@Component
public class Performance {
    public void perform() {
        System.out.println(" perform ");
    }

}
