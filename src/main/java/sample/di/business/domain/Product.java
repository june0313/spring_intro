package sample.di.business.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by wayne on 2016. 3. 26..
 *
 */
@Getter
@ToString
@AllArgsConstructor
public class Product {
	private String name;
	private int price;
}
