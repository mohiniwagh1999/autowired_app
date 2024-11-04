package com.app1.chip;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
@Primary
public class Chip64 implements Ichip {
  public Chip64()
  {
	  System.out.println("64 constructor");
  }
	
	@Override
	public boolean process() {
		// TODO Auto-generated method stub
		System.out.println("64bit processing started..");
		return true;
		
	}

}
