package prototype_and_scope;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by wayne on 2016. 4. 16..
 */
public class ScopeTest {

	@Test
	public void singletonScopeTest() throws Exception {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SingletonBean.class, SingletonClientBean.class);
		Set<SingletonBean> singletonBeanSet = new HashSet<>();

		singletonBeanSet.add(ac.getBean(SingletonBean.class));
		singletonBeanSet.add(ac.getBean(SingletonBean.class));
		assertThat(singletonBeanSet.size(), is(1));

		singletonBeanSet.add(ac.getBean(SingletonClientBean.class).bean1);
		singletonBeanSet.add(ac.getBean(SingletonClientBean.class).bean2);
		assertThat(singletonBeanSet.size(), is(1));

		System.out.println(singletonBeanSet);
	}

	static private class SingletonBean {}

	static private class SingletonClientBean {
		@Autowired SingletonBean bean1;
		@Autowired SingletonBean bean2;
	}

	@Test
	public void prototypeScopeTest() throws Exception {
		ApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class, PrototypeClientBean.class);
		Set<PrototypeBean> prototypeBeanSet = new HashSet<>();

		prototypeBeanSet.add(ac.getBean(PrototypeBean.class));
		assertThat(prototypeBeanSet.size(), is(1));
		prototypeBeanSet.add(ac.getBean(PrototypeBean.class));
		assertThat(prototypeBeanSet.size(), is(2));

		prototypeBeanSet.add(ac.getBean(PrototypeClientBean.class).bean1);
		assertThat(prototypeBeanSet.size(), is(3));
		prototypeBeanSet.add(ac.getBean(PrototypeClientBean.class).bean2);
		assertThat(prototypeBeanSet.size(), is(4));

		System.out.println(prototypeBeanSet);
	}

	@Scope("prototype")
	static private class PrototypeBean {}

	static private class PrototypeClientBean {
		@Autowired PrototypeBean bean1;
		@Autowired PrototypeBean bean2;
	}
}
