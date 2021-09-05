package com.example.demo;

 

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

 


public class ProductService {

 

    static HashMap<Integer, Product> ProductIdMap = getProductIdMap(); //map list

 

 


    public ProductService() {
        super();
        if (ProductIdMap == null) {
            ProductIdMap = new HashMap<Integer,Product>();
            Product laptopProduct = new Product(1,78,"tv","led","mi",100000,"GOOD TV",100.00,1 );
            Product laptopProduct1 = new Product(2,98,"laptop","pavilion","HP",50000,"GOOD LAPTOP OF WORK",400.00,1 );
            Product watchProduct = new Product(3,400,"watch","BENNETTON","UCB",80000,"GOOD WATCH",200.00,0 );
            Product shoeProduct = new Product(3,350,"shoes","hi","sports",10000,"GOOD SHOES",150.00,1 );

 

 

//adding map list of collections in java
ProductIdMap.put(1, laptopProduct);
ProductIdMap.put(2, laptopProduct1);
ProductIdMap.put(3, watchProduct);
ProductIdMap.put(4, shoeProduct);
}
}

 


public List<Product> getAllProductlist() {
List<Product> productlist = new ArrayList<Product>(ProductIdMap.values());
return productlist;
}

 

public Product getProduct(int id) {
Product product = ProductIdMap.get(id);
return product;
}
// add student
public Product addProduct(Product product) {
product.setId(getMaxId()+ 1);
// key , value
ProductIdMap.put(product.getId(), product); ///logic class
return product;
}
//update
public Product updateProduct(Product product) {
if (product.getId() <= 0)
return null;
ProductIdMap.put(product.getId(), product);
return product;

 

}
//delete

 

public void deleteProduct(int id) {
ProductIdMap.remove(id);
}

 

public static HashMap<Integer, Product> getProductIdMap() {
return ProductIdMap;
}

 

// Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : ProductIdMap.keySet()) {
if (max <= id)
max = id;

 

}
return max;
}

 

 

}