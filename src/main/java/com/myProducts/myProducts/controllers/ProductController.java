package com.myProducts.myProducts.controllers;

import com.myProducts.myProducts.execptions.ErrorMensageExecption;
import com.myProducts.myProducts.models.ProductModel;
import com.myProducts.myProducts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    ErrorMensageExecption errorMensage = new ErrorMensageExecption("Product not found");

    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel dataRequestProducts){
        ProductModel productSaved = productService.saveProduct(dataRequestProducts);
        return ResponseEntity.status(HttpStatus.CREATED).body(productSaved);
    }

    @GetMapping
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Object> getOneProduct(@PathVariable(value = "productId")UUID productId){

        Optional<ProductModel> product = productService.getOneProduct(productId);

        if(product.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMensage);
        }
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value = "productId")UUID productId,
                                                @RequestBody ProductModel dataRequestProducts){

        Optional<ProductModel> product = productService.getOneProduct(productId);

        if(product.isPresent()){

            ProductModel productUpdate = product.get();

            productUpdate.setName(dataRequestProducts.getName());
            productUpdate.setDescription(dataRequestProducts.getDescription());
            productUpdate.setProductType(dataRequestProducts.getProductType());
            productUpdate.setLastUpdateDate(LocalDateTime.now());

            productService.saveProduct(productUpdate);

            return ResponseEntity.status(HttpStatus.OK).body(productUpdate);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMensage);
        }
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "productId")UUID productId){

        Optional<ProductModel> product = productService.getOneProduct(productId);

        if(product.isPresent()){
            productService.deleteProduct(productId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMensage);
        }
    }
}
