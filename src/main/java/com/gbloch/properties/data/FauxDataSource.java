package com.gbloch.properties.data;

import lombok.Getter;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@PropertySource("classpath:datasource.properties")
@Component
@Getter
public final class FauxDataSource {
    private final String user;
    private final String password;
    private final String url;

    FauxDataSource(Environment environment) {
        this.user = environment.getProperty("gbloch.username");
        this.password = environment.getProperty("gbloch.password");
        this.url = environment.getProperty("gbloch.dburl");
    }
}
