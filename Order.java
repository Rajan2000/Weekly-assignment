package com.example.demo;

 

import java.util.List;

 

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

 

public class Order {
OrderService orderservice=new OrderService();

 

    // Get call using spring based web services
    @GetMapping("/myurl")
    public String sayHello() {
        System.out.println("Hello");
        return "Hi User";
    }

 

    // retrieve the product info using @GET Method
    @GetMapping("/orderinfo")
   public OrderInfo getOrderInfo() {
        
        OrderInfo order =new  OrderInfo();
   //creating java object
   order.setOrder_id(1);
   order.setCustomer_address("Mumbai");
   order.setCustomer_id(555);
   order.setProduct_id(456);
   order.setTotal_amt("1277905");
   return order;

 

    }

 

    // retrieve the person information by id
    @GetMapping("/orderinfo/{id}")
   public OrderInfo getOrderById(@PathVariable("id") Integer id) {
        
        OrderInfo order =new  OrderInfo();
       //creating java object
       order.setOrder_id(1);
       order.setCustomer_address("Chennai");
       order.setCustomer_id(555);
       order.setProduct_id(456);
       order.setTotal_amt("129977");
       return order;
       
  
}
        // add the order information POst
    @PostMapping(value = "/insertorderdetails")
  public OrderInfo insertDummyOrder(@RequestBody OrderInfo order) 
    
    {
        return new OrderService().addOrder(order); //calling the service
  }
        // update product info
    @PutMapping("/updateorder")
  public OrderInfo updateOrderInfo(@RequestBody OrderInfo order) 
    
{

 

  return new OrderService().updateOrder(order);
  
}

 

    // get list
    @GetMapping("/getorderlist")
  public List<OrderInfo> getDummyList()
    
    {
List<OrderInfo> listOfOrder = new OrderService().getAllOrderlist();
  return listOfOrder;
    }  
    
    
    // delete list
    @DeleteMapping("/deleteorder/{id}")
  public List<OrderInfo> deleteOrderById(@PathVariable Integer id) {
    new OrderService().deleteOrder(id);
      return new OrderService().getAllOrderlist();
    }

 

}