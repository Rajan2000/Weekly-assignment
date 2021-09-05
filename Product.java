package com.example.demo;

public class Product {
 private Integer id;
 private Integer Quantity;
 private String Category;
 private String brand;
 private String name;
 private String description;
 private double price;
 private double discount;
 private int status;

 public Product() {
 super();
 }
 ///constructor
 public Product(Integer id, Integer Quanity,String Category, String name, String Brand,double price , String description , double discount , int status) {
 super();
 this.id = id;
 this.Quantity= Quanity;
 this.Category = Category;
 this.name =name;
 this.brand=Brand;
 this.price = price;
 this.description=description;
 this.discount= discount;
 this.status=status;
 }

 public Integer getId() {
 return id;
 }
 public void setId(Integer id) {
 this.id = id;
 }
 public Integer getQuantity() {
 return Quantity;
 }
 public void setQuantity(Integer quantity) {
 Quantity = quantity;
 }
 public String getCategory() {
 return Category;
 }
 public void setCategory(String category) {
 Category = category;
 }
 public String getBrand() {
 return brand;
 }
 public void setBrand(String brand) {
 this.brand = brand;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getDescription() {
 return description;
 }
 public void setDescription(String description) {
 this.description = description;
 }
 public double getPrice() {
 return price;
 }
 public void setPrice(double price) {
 this.price = price;
 }
 public double getDiscount() {
 return discount;
 }
 public void setDiscount(double discount) {
 this.discount = discount;
 }
 public int getStatus() {
 return status;
 }
 public void setStatus(int status) {
 this.status = status;
 }





}