package com.dailycodebuffer.apigateway;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Iabur on July 06, 2021.
 */
@RestController
@EnableHystrix
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User service taking longer than expected " +
                "please try again";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department service taking longer than expected " +
                "please try again";
    }
}
