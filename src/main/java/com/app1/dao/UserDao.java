package com.app1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao()
	{
		System.out.println("user dao constructor called");
	}
  public String findName(int id)
  {
	  if(id==100)
	  {
		  return "rani";
	  }
	  else
	  {
		  return "raja";
	  }
  }
}
