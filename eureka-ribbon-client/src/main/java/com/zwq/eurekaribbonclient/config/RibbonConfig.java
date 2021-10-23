package com.zwq.eurekaribbonclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description: 配置类
 *
 * @author zwq
 * @date 2021/10/20 22:04
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    RestTemplate resttemplate() {
        return new RestTemplate();
    }

}
