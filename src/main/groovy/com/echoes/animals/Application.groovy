package com.echoes.animals

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ImportResource

/**
 * Created by jguidoux on 25/10/15.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.echoes")
@ImportResource("classpath:catApplicationContext.xml") // 1
class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
