package com.fast;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FastWorkFlowController {
    @Resource
    private FastWorkFlowProperties myProperties;


    @RequestMapping("/test")
    public String test() {
        return "来自starter：" + myProperties.getName();
    }
}