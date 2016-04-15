package annotation;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by wayne on 2016. 4. 11..
 */
public class AnnotationConfigTest {

	@Test
	public void simpleAutowired() throws Exception {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanA.class, BeanB.class);
		BeanA beanA = context.getBean(BeanA.class);

		assertThat(beanA.beanB, is(notNullValue()));

	}

	private static class BeanA {
		@Autowired
		private BeanB beanB;
	}

	private static class BeanB {
	}
}
