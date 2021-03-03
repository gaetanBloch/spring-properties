package com.gbloch.properties;

import com.gbloch.properties.data.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPropertiesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringPropertiesApplication.class, args);
        FakeDataSource dataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(dataSource.getUser());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getUrl());
    }

}
