package org.polyfill.api.configurations;

import org.polyfill.api.components.ServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

/**
 * Created by smo on 6/7/17.
 */
@Configuration
public class CustomPolyfillListConfig {
    @Bean
    public ServiceConfig serviceConfig() {
        List<String> polyfillList = Arrays.asList("d", "eee");
        return new ServiceConfig().setPolyfills(polyfillList);
    }
}
