package jpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by wayne on 2016. 4. 9..
 */
@Data
@Entity
@Table(name = "tbl_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;

	private String orderName;

	private String node;

	private int price;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
}
