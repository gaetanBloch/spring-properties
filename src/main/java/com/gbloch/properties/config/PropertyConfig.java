package com.gbloch.properties.config;

import com.gbloch.properties.data.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Configuration
@PropertySource("classpath:datasource.properties")
class PropertyConfig {

    private final Environment environment;

    @Value("${gbloch.username}")
    private String user;
    @Value("${gbloch.password}")
    private String password;
    @Value("${gbloch.dburl}")
    private String url;

    PropertyConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    FakeDataSource dataSource() {
        return FakeDataSource.builder()
                .user(environment.getProperty("username"))
                .password(password)
                .url(url)
                .build();
    }

    @Bean
    static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
