package com.myProducts.myProducts.repositories;

import com.myProducts.myProducts.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
