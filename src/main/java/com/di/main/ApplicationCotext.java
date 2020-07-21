package com.di.main;


import com.di.Service.MobileBrands;
import com.di.ServiceImpl.OneplusImpl;
import com.di.ServiceImpl.SamsungImpl;

public class ApplicationCotext {
	
	private final MobileBrands mobileSource;
	private final MobileBrands landLineSource;
	
	public ApplicationCotext() {
		this.mobileSource =   new MobileContext().resource();
		this.landLineSource =   new LandLineContext().resource();
		
	}
	
	
	public <T> T  getBeanByName(Class<?> clazz) {
		if(clazz.getName().equals(OneplusImpl.class.getName())) {
			return (T)landLineSource;
		}else if(clazz.getName().equals(SamsungImpl.class.getName())) {
			return (T)mobileSource;
		}
		return null;
			
		
		
	}
	
	private static class LandLineContext implements OneplusImpl.Provider{}
	
	private static class MobileContext implements SamsungImpl.Provider{}

}
