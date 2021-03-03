package com.gbloch.properties;

import com.gbloch.properties.data.FakeDataSource;
import com.gbloch.properties.data.FakeJmsBroker;
import com.gbloch.properties.data.FauxDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPropertiesApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringPropertiesApplication.class, args);

        System.out.println("------- Spring Configuration Properties");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

        System.out.println("------- Spring Environment Properties");
        FauxDataSource fauxDataSource = ctx.getBean(FauxDataSource.class);
        System.out.println(fauxDataSource.getUser());
        System.out.println(fauxDataSource.getPassword());
        System.out.println(fauxDataSource.getUrl());

        System.out.println("------- JMS Properties");
        FakeJmsBroker jmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(jmsBroker.getUser());
        System.out.println(jmsBroker.getPassword());
        System.out.println(jmsBroker.getUrl());
    }
}
