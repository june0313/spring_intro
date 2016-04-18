package spring31;

import javax.annotation.PostConstruct;

public class Hello {
	@PostConstruct
	public void init() {
		System.out.println("INIT");
	}

	public void sayHello() {
		System.out.println("HELLO~~~~");
	}
}
