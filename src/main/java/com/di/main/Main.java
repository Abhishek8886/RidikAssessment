package com.di.main;


import com.di.Service.MobileBrands;
import com.di.ServiceImpl.OneplusImpl;
import com.di.ServiceImpl.SamsungImpl;

public class Main {
	
	private static ApplicationCotext context; 

	public static void main(String[] args) {
		 context =  new ApplicationCotext();
		MobileBrands telco = context.getBeanByName(OneplusImpl.class);
		telco.getBrandName();
		telco.getBrandDetails();
		telco.getBrandDetails();
		 telco =  context.getBeanByName(SamsungImpl.class);
		telco.getBrandName();
		
		

	}
	
	
	

}
