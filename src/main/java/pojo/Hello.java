package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wayne on 2016. 4. 9..
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "wayneBean")
public class Hello {
	private String name;

	@Resource(name = "printer2") // @Resource를 이용하는 경우 반드시 참조할 빈이 존재해야한다. 없으면 예외 발생
	// @Resource는 이름을 이용한 프로퍼티 설정이라고 기억해두자
	private Printer printer;

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		printer.print(sayHello());
	}
}
