package spring31;

import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayne on 2016. 4. 18..
 */
public class BeanDefinitionUtils {
	public static void printBeanDefinitions(GenericApplicationContext genericApplicationContext) {
		List<List<String>> roleBeanInfos = new ArrayList<>();
		roleBeanInfos.add(new ArrayList<>());
		roleBeanInfos.add(new ArrayList<>());
		roleBeanInfos.add(new ArrayList<>());

		for (String name : genericApplicationContext.getBeanDefinitionNames()) {
			int role = genericApplicationContext.getBeanDefinition(name).getRole();
			List<String> beanInfos = roleBeanInfos.get(role);
			beanInfos.add(role + "\t" + name + "\t" + genericApplicationContext.getBean(name).getClass().getName());
		}

		for (List<String> beanInfos : roleBeanInfos) {
			beanInfos.forEach(System.out::println);
		}
	}
}
