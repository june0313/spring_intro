package spring31;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by wayne on 2016. 4. 18..
 */
public class BeanRoleTest {
	GenericApplicationContext ac;
	SimpleConfig sc;

	@Before
	public void setUp() throws Exception {
		ac = new GenericXmlApplicationContext("spring31/beanrole.xml");
		sc = ac.getBean(SimpleConfig.class);
	}

	@Test
	public void testSimpleConfig() throws Exception {
		sc.hello.sayHello();
	}

	@Test
	public void testBeanDefinitions() throws Exception {
		BeanDefinitionUtils.printBeanDefinitions(ac);
	}
}