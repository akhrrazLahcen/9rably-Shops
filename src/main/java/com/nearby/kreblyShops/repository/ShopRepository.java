package com.nearby.kreblyShops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nearby.kreblyShops.model.Shop;

 
public interface ShopRepository extends JpaRepository<Shop, Long>{
	
	Shop findByName(String name);

}
