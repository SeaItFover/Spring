package com.codepig.spy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.codepig.spy")
@Import(JdbcConfiguration.class)
public class SpringConfiguration {

}
