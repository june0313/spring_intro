package autoscan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Hello;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by wayne on 2016. 4. 9..
 */
public class AutoBeanScanningTest {
	@Test
	public void testScanning() throws Exception {

		// pojo 패키지를 스캔해서 @Component 가 붙은 클래스들을 자동으로 빈으로 등록한다.
		// 빈을 정의한 xml 파일등이 필요하지 않음

		ApplicationContext context = new AnnotationConfigApplicationContext("pojo");
		Hello hello = context.getBean("wayneBean", Hello.class);

		assertThat(hello, is(notNullValue()));
	}
}
