package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JdbcConfiguration.class)
@ComponentScan("com.codepig.spy")
public class SpringConfiguration {

}
