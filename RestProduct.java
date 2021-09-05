package com.example.demo;

 

import java.util.List;

 

///import javax.websocket.server.PathParam;

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 

@RestController

 

public class RestProduct {
ProductService productService= new ProductService();/// FOR PRODUCT

 

 

//RETRIEVE PRODUCT INFO USING @GET MEthod
@GetMapping("/ProductInfo")
public Product getDummyProduct(){
Product p = new Product();// creating java product
p.setId(2);
p.setQuantity(100);
p.setCategory("laptop");
p.setName("pavilion");
p.setBrand("HP");
p.setDescription("good laptop for work");
p.setPrice(50000);
p.setDiscount(500);
p.setStatus(1);
return p;
}

 

 

// RETRIEVE THE PRODUCT INFO BY ID

 

@GetMapping("/productinfoid/{id}")
public Product getDummyProductById(@PathVariable("id") Integer id) {

 

Product p = new Product();// creating java product
p.setId(2);
p.setQuantity(100);
p.setCategory("TV");
p.setName("lcd");
p.setBrand("mi");
p.setDescription("good tv for work");
p.setPrice(50000);
p.setDiscount(500);
p.setStatus(1);
return p;
}

 

 


// ADD THE PRODUCT INFORMATION BY POST

 

@PostMapping(value = "/insertproductdetails")
public Product insertDummyProduct(@RequestBody Product product) {
return productService.addProduct(product); //calling the service
}

 

 

 


//UPDATE PRODUCT INFO
@PutMapping("/updateproduct")
public Product updateProductInfo(@RequestBody Product product) {
return productService.updateProduct(product);
}

 

 

//GET PRODUCT LIST
@GetMapping("/getproductlist")
public List<Product> getDummyProductList() {
List<Product> listOfProduct = productService.getAllProductlist();
return listOfProduct;
}

 

 

//DELETE PRODUCT LIST

 

@DeleteMapping ("/deleteproduct/{id}")
public List<Product> deleteProductById(@PathVariable Integer id) {
new ProductService().deleteProduct(id);
return new ProductService().getAllProductlist();
}

 


}