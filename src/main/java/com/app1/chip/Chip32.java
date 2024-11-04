package com.app1.chip;

import org.springframework.stereotype.Component;

@Component("chip32")
public class Chip32 implements Ichip{
public Chip32()
{
	System.out.println("32 constructor called");
}
	
	@Override
	public boolean process() {
		// TODO Auto-generated method stub
		System.out.println("32bit processing started..");
		return true;
		
	}

}
