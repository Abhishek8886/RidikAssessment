package com.di.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.Mac;

import com.di.Service.ProviderInterFace;
import com.di.Service.MobileBrands;

public class SamsungImpl extends ProviderImpl  implements MobileBrands  {

private static String brandName = "Samsung";	

	@Override
	public String  getBrandName() {
		return brandName;
		
	}
	
	
	@Override
	public String getBrandDetails() {
		String details= "Samsung is South Korean Based Company.";
		return details;
	}

	@Override
	public List<String> getModels() {
		List<String> models = new ArrayList<String>();
		models.add("S20");
		models.add("S10");
		models.add("S9");
		models.add("S8");
		return models;
	}
	
	public interface Provider extends ProviderInterFace.provide<MobileBrands>{
	       
		@Override
        default MobileBrands resource() {
          return new SamsungImpl();
        }
    }
	

}
