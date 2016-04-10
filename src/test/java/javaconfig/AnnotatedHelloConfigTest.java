package javaconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2016. 4. 9..
 */
public class AnnotatedHelloConfigTest {

	@Test
	public void testAnnotatedHello() throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotatedHelloConfig.class);

		AnnotatedHello hello = context.getBean("annotatedHello", AnnotatedHello.class);
		assertThat(hello, is(notNullValue()));

		// @Configuration 이 붙은 클래스는 자신도 빈으로 등록된다.
		AnnotatedHelloConfig config = context.getBean("annotatedHelloConfig", AnnotatedHelloConfig.class);
		assertThat(config, is(notNullValue()));

		assertThat(config.annotatedHello(), is(sameInstance(hello)));
		assertSame(config.annotatedHello(), hello);
	}
}