package com.Product.Service;

import com.Product.Model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;

@Service
public class ProductService {

   private final List<ProductModel> products = new ArrayList<>();
   private Long ids = 1L;

   public ProductModel addProduct(ProductModel product){
       product.setId(ids++);
       products.add(product);
       return product;
   }

   public Optional<ProductModel> getProduct(Long id){
       return products.stream()
               .filter(product -> product.getId().equals(id))
               .findFirst();

   }
}
