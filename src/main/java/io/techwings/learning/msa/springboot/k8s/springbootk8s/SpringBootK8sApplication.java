package io.techwings.learning.msa.springboot.k8s.springbootk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@SpringBootApplication
@ConfigurationPropertiesScan()
public class SpringBootK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootK8sApplication.class, args);
    }



}
