package sample.di.business.service;

import sample.di.business.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by wayne on 2016. 3. 26..
 */
@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public Product findProduct() {
		return productDao.findProduct("wayne");
	}
}
