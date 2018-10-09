package org.codebeneath.vcap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * The various ways to read in spring boot application properties
 */
@Component
public class PropertiesDumper implements CommandLineRunner {

    YAMLConfig ymlConfig;
    VCAPServices vcapConfig;
    @Value("${vcap.services:NOT_FOUND}")
    String vcapServicesAsString;

    public PropertiesDumper(YAMLConfig ymlConfig, VCAPServices vcapConfig) {
        this.ymlConfig = ymlConfig;
        this.vcapConfig = vcapConfig;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Yml file: [" + ymlConfig + "] \n\n");
        System.out.println("Vcap Services: [" + vcapConfig + "] \n\n");
        System.out.println("Vcap String: [" + vcapServicesAsString + "] \n\n");
    }

}
