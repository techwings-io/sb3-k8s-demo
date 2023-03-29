package io.techwings.learning.msa.springboot.k8s.springbootk8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Value("${demo.welcomeMessage}")
    private String welcomeMessage;
    @RequestMapping("/")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body(welcomeMessage);
    }
}
