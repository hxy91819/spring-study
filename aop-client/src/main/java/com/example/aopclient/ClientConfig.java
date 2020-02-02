package com.example.aopclient;

import com.example.aop.concert.ConcertConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author chenjing
 * @date 2020-01-30 20:35
 */
@Configuration
@Import(ConcertConfig.class)
public class ClientConfig {
}
