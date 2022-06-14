package com.fast;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fast.workflow.properties")
public class FastWorkFlowProperties {
    @Value("${fast.workflow.properties.name}")
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}