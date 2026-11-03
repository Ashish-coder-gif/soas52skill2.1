package soa.service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Service;

import soa.repo.ProductsRepo;
import soa.model.Products;

@Service
public class ProductsService {

ProductsRepo PR;

public ProductsService(ProductsRepo PR) {
this.PR = PR;
}

public Object getAllProducts() {

Map<String, Object> response = new HashMap<>();

try {
List<Products> products = PR.findAll();
response.put("products", products);
} catch (Exception e) {
response.put("code", 500);
response.put("message", e.getMessage());
}

return response;
}
}