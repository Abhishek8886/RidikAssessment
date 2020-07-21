package com.di.ServiceImpl;

import com.di.Service.ProviderInterFace;

import java.util.ArrayList;
import java.util.List;

import com.di.Service.MobileBrands;

public class OneplusImpl extends ProviderImpl implements MobileBrands{
	
	private static String brandName = "OnePlus";	

	
	

	@Override
	public String getBrandName() {
		
		return brandName;
		
	}


	@Override
	public String getBrandDetails() {
		String details= brandName+" is China Based Company.";
		return details;
	}

	@Override
	public List<String> getModels() {
		List<String> models = new ArrayList<String>();
		models.add("8");
		models.add("8 PRO");
		models.add("Nord");
		models.add("7T");
		return models;
	}

	

	
	public interface Provider extends ProviderInterFace.provide<MobileBrands>{
	    @Override
        default MobileBrands resource() {
          return new OneplusImpl();
        }
    }
	

}
