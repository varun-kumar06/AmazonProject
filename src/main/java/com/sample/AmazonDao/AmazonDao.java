package com.sample.AmazonDao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.AmazonEntity;
import com.sample.AmazonRepository.AmazonRepository;

@Repository
public class AmazonDao {
	
	@Autowired
	AmazonRepository ar;

	public String postAlldetails(List<AmazonEntity> a) {
		ar.saveAll(a);
		return "Posted successfully";
	}
	
	public List<AmazonEntity> getAlldetails(){
		 return ar.findAll();
	 }
	
	public List<AmazonEntity> getByProduct(String b){
		 return ar.getByBrand( b);
	 }
	
	public List<AmazonEntity> getByQuantity(int aa){
		return ar.getByQuantity(aa);
	}
	
	public String postByLength(AmazonEntity name){
		ar.save(name);
		return "PostedSuccess";
	}
	
	public AmazonEntity getById(int c){
		 return ar.findById(c).get();
	 }
	
	public String postByNameEcp(AmazonEntity c) {
		 ar.save(c);
		 return "Posted";
	}
}
