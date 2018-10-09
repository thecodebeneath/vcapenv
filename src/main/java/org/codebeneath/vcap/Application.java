package org.codebeneath.vcap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run using one of these methods:
 * 1. Set env and then "mvn spring-boot:run"
 * 2. VCAP_SERVICES=... mvn spring-boot:run
 * 3. java -jar -Dspring.profiles.active=prod target/vcapenv-1.0-SNAPSHOT.jar
 * 4. Netbeans "Execute goal with modifiers...", Add > New Environment Variable, Env.VCAP_SERVICES={}. Note no single ticks around the {} value
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
