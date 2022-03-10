package com.Springcrudlogin.Springcrudlogin.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Springcrudlogin.Springcrudlogin.Models.RegisterModel;

@Repository
public class RegisterDao 
{
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	
	public int register(RegisterModel obj)
	{
		System.out.println("Values Going to get registered");
	    String sql2 = "insert into Admin_info (Name_field, User_name , Password_field) values ('"+obj.getName()+"','"+obj.getUsername()+"','"+obj.getPassword()+"')";
	    System.out.println("Values Finished registered");
	    return jdbcTemplate.update(sql2);    

	}


}
