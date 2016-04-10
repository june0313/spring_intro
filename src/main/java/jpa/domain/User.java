package jpa.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by wayne on 2016. 4. 9..
 */
@Data
@Entity
@Table(name = "tbl_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	private String userName;

	private String nickName;

	private String address;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Order> orders;
}
