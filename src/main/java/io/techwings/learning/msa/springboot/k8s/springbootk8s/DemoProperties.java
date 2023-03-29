package io.techwings.learning.msa.springboot.k8s.springbootk8s;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Data
public class DemoProperties {
    private String welcomeMessage;
}
