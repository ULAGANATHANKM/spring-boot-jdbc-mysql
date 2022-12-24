package com.ebrain.springboot.training.demotraining.repository;

import java.sql.Connection;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import com.ebrain.springboot.training.demotraining.dto.User;

@Repository
public class UserRepository {

	
	private static Connection connection;
	
	
	public Connection getConnection() {
		
		if(!ObjectUtils.isEmpty(connection)) {
			return connection;
		}
		
		 
		//DBCOnnection
		
		return connection;
	}
	
	public void save(User user) {
		
		//Get connection
		//Create PreparedStatement
		//Save User object by calling executeUpdate
		
	}
	
	public List<User> getAllUsers() {
		
		//Get connection
		//Create PreparedStatement
		//Get Result Set
		//Parse Result Set
		//Return User List
		
		return null;
	}
	
}
