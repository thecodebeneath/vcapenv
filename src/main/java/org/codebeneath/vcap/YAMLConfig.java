package org.codebeneath.vcap;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/** 
 * Reads the packaged application.yml properties, given the spring.profile id from set in application.properties
 */
@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    private String name;
    private String environment;
    private List<String> servers = new ArrayList<>();
    
}
