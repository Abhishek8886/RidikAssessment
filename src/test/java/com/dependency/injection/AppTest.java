package com.dependency.injection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.di.Service.MobileBrands;
import com.di.ServiceImpl.SamsungImpl;
import com.di.main.ApplicationCotext;






/**
 * Unit test for simple App.
 */

public class AppTest{
  

	@Test
	public void testBrandName() {
		ApplicationCotext cntxt =  new ApplicationCotext();
		MobileBrands source =  cntxt.getBeanByName(SamsungImpl.class);
		assertNotNull(source.getBrandName());
		assertEquals("Samsung", source.getBrandName());	
	//	assertNotNull(source.telcoType());
		
	}
	
	@Test
	public void checkModelsNotNull() {
		ApplicationCotext cntxt =  new ApplicationCotext();
		MobileBrands source =  cntxt.getBeanByName(SamsungImpl.class);
		assertNotNull(source.getModels());	
	
		
	}
}
