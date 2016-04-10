package di.business.domain;

import org.junit.Before;
import org.junit.Test;
import sample.di.business.domain.Product;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2016. 3. 26..
 */
public class ProductTest {
	private Product sut;

	@Before
	public void setUp() throws Exception {
		sut = new Product("product_name", 5000);
	}

	@Test
	public void testProductToString() throws Exception {
		System.out.println(sut.toString());
		assertThat(sut.toString(), is("Product(name=product_name, price=5000)"));
	}
}