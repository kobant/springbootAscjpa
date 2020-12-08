package com.example.demo.pojo;


import javax.persistence.*;


/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/10 16:20
 */

@Entity
@Table(name = "new_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "u_name" ,length = 32,columnDefinition = "varchar(32) not null default '' comment '用户姓名'")
	private String name;

	@Column(name = "u_email",columnDefinition = "varchar(325) not null default '' comment '用户邮编'")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
