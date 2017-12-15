package com.deloitte.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="APP_USER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private String username;
	private String mobile;
	private String email;
	private String password;
	private Date refreshed;
	
}
