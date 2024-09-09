package com.sample.AmazonController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.AmazonEntity; 
import com.sample.AmazonService.AmazonService;

@RestController 
@RequestMapping(value="/Amazon") 
public class AmazonController {
	
	@Autowired
	AmazonService as;
	
	@PostMapping(value="/postAlldetails")
	public String postAlldetails(@RequestBody List<AmazonEntity> a){
		return as.postAlldetails(a); 
	}

	 @GetMapping(value="/GetAllDetails")
	 public List<AmazonEntity> getAlldetails(){
		 return as.getAlldetails(); 
	 }
	 
	 @GetMapping(value="/getByproduct/{b}")
	 public List<AmazonEntity> getByProduct(@PathVariable String b){
		 return as.getByProduct(b);
	 }
	 
	 @GetMapping(value="/getByQuantity/{aa}")
	 public List<AmazonEntity> getByQuantity(@PathVariable int  aa){
			return as.getByQuantity(aa);
		}
	 
	 @PostMapping(value="/postByLength")
	 public String postByLength(@RequestBody AmazonEntity name){
		 return as.postByLength(name);
	 }
	 
	 @GetMapping(value="/getById/{c}")
	 public AmazonEntity getById(@PathVariable int c) throws Exception
	 {
		 return as.getById(c);
	 }
	 
	 @PostMapping(value="/postByNameEcp")
	 public String postByNameEcp(@RequestBody AmazonEntity c) throws Exception {
		 return as.postByNameEcp(c);
	 }
	
}
