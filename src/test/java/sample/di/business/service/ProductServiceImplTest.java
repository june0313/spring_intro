package sample.di.business.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.di.business.domain.Product;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by wayne on 2016. 3. 26..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class ProductServiceImplTest {

	@Autowired
	private ProductService productService;

	@Test
	public void testProductService() throws Exception {
		Product product = productService.findProduct();
		System.out.println(product);
		assertThat(product.toString(), is("Product(name=wayne, price=100)"));
	}
}