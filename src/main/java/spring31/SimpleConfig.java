package spring31;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wayne on 2016. 4. 18..
 */
@Configuration
public class SimpleConfig {
	@Autowired Hello hello;

	@Bean
	Hello hello() {
		return new Hello();
	}
}

