package javaconfig;

import org.springframework.context.annotation.Bean;
import pojo.Hello;
import pojo.Printer;
import pojo.StringPrinter;

/**
 * Created by wayne on 2016. 4. 10..
 *
 *  @Configuration 을 붙이지 않으면 @Bean 메소드를 호출하더라도
 *  싱글톤 빈이 아닌 매번 새로운 객체를 리턴하게 된다.
 *
 */

public class HelloService {
	private Printer printer;

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Bean
	public Hello hello() {
		Hello hello = new Hello();
		hello.setName("Spring");
		hello.setPrinter(this.printer);
		return hello;
	}

	@Bean
	public Hello hello2() {
		Hello hello = new Hello();
		hello.setName("Spring2");
		hello.setPrinter(printer()); // 매번 다른 오브젝트를 주입받게 됨.
		return hello;
	}

	@Bean
	private Printer printer() {
		return new StringPrinter();
	}
}
