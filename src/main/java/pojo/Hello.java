package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

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
	private Printer printer;

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		printer.print(sayHello());
	}
}
