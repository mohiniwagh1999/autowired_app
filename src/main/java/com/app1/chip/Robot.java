package com.app1.chip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Robot {
	@Autowired
	//@Qualifier("chip64")
	private Ichip chip;
	
	public Robot()
	{
		System.out.println("robot constructor called");
	}
	public void doWork()
	{
		System.out.println("injected"+chip.getClass().getName());
		boolean process = chip.process();
		if(process==true)
		{
			System.out.println("robot working");
		}
		else
		{
			System.out.println("robot  having problem");
		}
	}

}
