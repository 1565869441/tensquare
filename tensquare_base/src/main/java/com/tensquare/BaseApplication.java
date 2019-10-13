package com.tensquare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 20:19
 * @描述
 * @版本 tensquare_parent
 * @更新者 com.tensquare
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1, 1);
    }

}
