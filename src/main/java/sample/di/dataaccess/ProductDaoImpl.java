package sample.di.dataaccess;

import sample.di.business.domain.Product;
import sample.di.business.service.ProductDao;
import org.springframework.stereotype.Component;

/**
 * Created by wayne on 2016. 3. 26..
 */
@Component
public class ProductDaoImpl implements ProductDao {
	@Override
	public Product findProduct(String name) {
		return new Product(name, 100);
	}
}
