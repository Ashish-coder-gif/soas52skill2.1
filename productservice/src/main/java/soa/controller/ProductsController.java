package soa.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soa.service.ProductsService;

@RestController
@RequestMapping("/")
public class ProductsController {

ProductsService PS;

public ProductsController(ProductsService PS) {
this.PS = PS;
}
@GetMapping("products")
public Object products() {
return PS.getAllProducts();
}
}