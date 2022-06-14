package com.fast;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "fast.workflow.properties.name")
@EnableConfigurationProperties(FastWorkFlowProperties.class)
public class FastWorkFlowAutoConfiguration {

}