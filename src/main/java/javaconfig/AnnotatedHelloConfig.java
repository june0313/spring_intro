package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wayne on 2016. 4. 9..
 */
@Configuration
public class AnnotatedHelloConfig {
	@Bean
	public AnnotatedHello annotatedHello() {
		return new AnnotatedHello();
	}
}
