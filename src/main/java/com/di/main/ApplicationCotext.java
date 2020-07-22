package com.di.main;


import com.di.Service.MobileBrands;
import com.di.ServiceImpl.OneplusImpl;
import com.di.ServiceImpl.SamsungImpl;

public class ApplicationCotext {
	
	private final MobileBrands onePlusSource;
	private final MobileBrands samsungSource;
	
	public ApplicationCotext() {
		this.onePlusSource =   new OneplusContext().resource();
		this.samsungSource =   new SamsungContext().resource();
		
	}
	
	
	public <T> T  getBeanByName(Class<?> clazz) {
		if(clazz.getName().equals(OneplusImpl.class.getName())) {
			return (T)onePlusSource;
		}else if(clazz.getName().equals(SamsungImpl.class.getName())) {
			return (T)samsungSource;
		}
		return null;
			
		
		
	}
	
	private static class OneplusContext implements OneplusImpl.Provider{}
	
	private static class SamsungContext implements SamsungImpl.Provider{}

}
