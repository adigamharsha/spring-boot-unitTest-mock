package com.google.harsha;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringRunner.class)
public class BusinessServiceImpltest {
	
	@Mock
	BusinessImpl mockBusinessImpl;
	
	@InjectMocks
	BusinessServiceImpl mockBusinessServiceImpl;
	
	

	@Test
	public void testretrieveValue() {		
		int arr1[] = new int[] {24,15,4};
		when(mockBusinessImpl.retrieveLargestNumber(arr1)).thenReturn(24);		
		assertEquals(24 ,mockBusinessServiceImpl.retrieveValue(arr1));
	}
	
	@Test
	public void testretrieveValue_oftwo() {		
		int arr1[] = new int[] {15,4};
		when(mockBusinessImpl.retrieveLargestNumber(arr1)).thenReturn(15);		
		assertEquals(15 ,mockBusinessServiceImpl.retrieveValue(arr1));
	}

}
