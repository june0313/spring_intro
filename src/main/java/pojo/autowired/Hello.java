package pojo.autowired;

import jdk.nashorn.internal.ir.annotations.Reference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pojo.Printer;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Collection;
import java.util.Map;

/**
 * Created by wayne on 2016. 4. 11..
 */
@Getter
@Setter
@Component
@Qualifier("mainHello")
public class Hello {
	private String name;

	@Autowired
	private Printer printer;

	@Autowired
	private Collection<Printer> printerCollection;

	@Autowired
	private Printer[] printers;

	@Autowired(required = false)
	// Map 을 이용하면 빈의 이름을 키로 하는 맵으로 DI 받을 수 있다.
	private Map<String, Printer> printerMap;

	@Resource(name = "mysqlDataSource")
	private DataSource dataSource;

	@Autowired
	@Qualifier("mainDB")
	private DataSource dataSource2;

	@Autowired
	@Database("main")
	private DataSource dataSource3;

	/**
	 *  이름을 이용해 빈을 지정하고 싶을 떄 : @Resource 사용
	 *  타입을 이용해 빈을 지정하고 싶을 때 : @Autowired 사용
	 */
}
