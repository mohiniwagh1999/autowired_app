package com.app1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app1.dao.UserDao;

@Service
public class UserService {
	//field injection
//	@Autowired
    private UserDao dao;
    /* @Autowired setter method injection
	 public void setDao(UserDao dao)
	 {
		 System.out.println("user service setter called");
		 this.dao=dao;
	 }*/
     //constructor injection
     //@Autowired remove unneccesary autowired
    //if only one constructor is there its optional
     public UserService(UserDao dao)
     {
    	 this.dao=dao;
     }
	 //default constructor
//	 public UserService()
//	 {
//		 System.out.println("user service constructor");
//	 }
    public String getName(int id)
    {
    	String name = dao.findName(id);
		return name;
    }
}
