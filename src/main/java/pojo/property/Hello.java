package pojo.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by wayne on 2016. 4. 14..
 */
@Getter
@Setter
public class Hello {
	@Value("#{systemProperties['os.name']}")
//	System.getProperties()
	private String name;

	@Value("false")
	private boolean flag;


	@Value("1.2")
	private double rate;
}
