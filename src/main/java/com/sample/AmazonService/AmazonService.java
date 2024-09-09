package com.sample.AmazonService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.AmazonEntity;
import com.sample.AmazonDao.AmazonDao;
import com.sample.exception.ProductNotFound;
import com.sample.exception.QuantityNotFound;

@Service
public class AmazonService {
	
	@Autowired
	AmazonDao ad;
	
	public String postAlldetails(List<AmazonEntity> a) {
		return ad.postAlldetails(a);
		
	}
	
	public List<AmazonEntity> getAlldetails(){
		 return ad.getAlldetails();
	 }
	
//	public  List<AmazonEntity> getByProduct(String b){
//		 List<AmazonEntity> a= ad.getByProduct(b);
//		 
//		 for(AmazonEntity x: a) {
//			 if(x.getProduct().equalsIgnoreCase(b)) {
//				 return ad.getByProduct(b);
//			 }
//		 }
//		 
//		 throw new ProductNotFound("Product Not Found");
//	 }
	
	public List<AmazonEntity> getByProduct(String b) {
		
		List<AmazonEntity> x = ad.getByProduct(b);
		if(x.isEmpty()) {
			throw new ProductNotFound("Product Not Found");
		}
		else {
			return ad.getByProduct(b);
		}
	}
	
	public List<AmazonEntity> getByQuantity(int aa) {
        List<AmazonEntity> quantities = ad.getByQuantity(aa);
        if (quantities.isEmpty()) {
            throw new QuantityNotFound("Quantity Not Valid");
        }
        return quantities;
    }
	
	public String postByLength(AmazonEntity name){
		 String quantities = ad.postByLength(name);
	        if (quantities.isEmpty()) {
	            throw new QuantityNotFound("Length not valid");
	        }
	        return quantities;
	}
	
	public AmazonEntity getById(int c) throws Exception
	{
		 return ad.getById(c);
	 }
	
	public String postByNameEcp(AmazonEntity c) throws Exception {
		
		if (c.getCustomerName().length() > 5) { 
	        throw new IndexOutOfBoundsException("Quantity Not Valid");
	    }
		else {
        return ad.postByNameEcp(c);
		}
	}
	
	
}
