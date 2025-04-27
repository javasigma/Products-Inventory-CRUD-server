package com.ProductManagement.Ecommerce_platform.repository;

import com.ProductManagement.Ecommerce_platform.entity.Productdroguerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdrogRepo extends JpaRepository<Productdroguerie, Long> {
}
