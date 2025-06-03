package com.gof.structural.c_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.gof.structural.c_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
