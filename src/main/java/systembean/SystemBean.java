package systembean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by wayne on 2016. 4. 16..
 */
public class SystemBean {
	@Autowired
	private ApplicationContext context;

	@Autowired
	private ResourceLoader resourceLoader;

	@Resource
	private Properties systemProperties;

	@Value("#{systemProperties[os.name]}")
	private String osname;

	public void specialJobWithContext() {
		this.context.getBean("test");
	}

	public void loadDataFile() {
		org.springframework.core.io.Resource resource = this.resourceLoader.getResource("WEB-INF/info.dat");
	}
}
