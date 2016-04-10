package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.Hello;
import pojo.Printer;
import pojo.StringPrinter;

/**
 * Created by wayne on 2016. 4. 10..
 */
// @Configuration 이 붙은 클래스는 빈 스캐닝을 통해 자동 등록될 수 있다

@Configuration
public class HelloConfig {
	@Bean
	public Hello hello() {
		Hello hello = new Hello();
		hello.setName("Spring");
		hello.setPrinter(printer());
		return hello;
	}

	@Bean
	public Hello hello2() {
		Hello hello = new Hello();
		hello.setName("Spring2");
		hello.setPrinter(printer());
		return hello;
	}

	@Bean
	public Printer printer() {
		return new StringPrinter();
	}
}
