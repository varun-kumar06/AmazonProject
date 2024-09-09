package com.sample.AmazonRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.AmazonEntity;

public interface AmazonRepository extends JpaRepository<AmazonEntity, Integer> {
	
	@Query(value="select* from Amazon_table where product =?", nativeQuery=true)
	public List<AmazonEntity> getByBrand(String b);
	
	@Query(value= "select* from Amazon_table where quantity =?", nativeQuery= true)
	public List<AmazonEntity> getByQuantity(int aa);
	
//	@Query(value= "select* from Amazon_table where custormerName>?", nativeQuery= true)
//	public List<AmazonEntity> postByLength(List<AmazonEntity> name);
	
	@Query(value="select* from Amazon_table where id =?", nativeQuery=true)
	public List<AmazonEntity> getById(int c);
	
	@Query(value="select* from Amazon_table where product =?", nativeQuery=true)
	public List<AmazonEntity> getIdEcx(int b);
	
	
}
