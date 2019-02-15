package com.huawei.cse;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class WebappApplication {
    public static void main(String[] args) {
         SpringApplication.run(WebappApplication.class,args);
    }
}
