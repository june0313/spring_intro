package pojo.property;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2016. 4. 14..
 */
public class HelloTest {

	AbstractApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(Hello.class);
	}

	@Test
	public void testGetName() throws Exception {
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getName());
		assertThat(hello.getName(), is("Mac OS X"));
		System.out.println(System.getProperties().toString());
	}

	@Test
	public void testGetFlag() throws Exception {
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.isFlag());
	}

	@Test
	public void testGetRate() throws Exception {
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getRate());
	}
}