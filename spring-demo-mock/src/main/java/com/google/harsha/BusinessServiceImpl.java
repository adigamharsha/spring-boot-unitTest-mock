package com.google.harsha;

import org.springframework.beans.factory.annotation.Autowired;

public class BusinessServiceImpl {
	
	@Autowired
	private BusinessImpl businessImpl;
	
	public int retrieveValue(int ar[]) {		
		return businessImpl.retrieveLargestNumber(ar);		
	}

}
