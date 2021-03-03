package com.gbloch.properties.data;

import lombok.Builder;
import lombok.Getter;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Builder
@Getter
public final class FakeDataSource {
    private final String user;
    private final String password;
    private final String url;
}
