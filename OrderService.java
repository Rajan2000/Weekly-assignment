package com.example.demo;

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

public class OrderService {

 

    static HashMap<Integer, OrderInfo> orderIdMap = null; // map list

 

    public OrderService() {
        if (orderIdMap == null) {
            orderIdMap = new HashMap<Integer, OrderInfo>();

 

            OrderInfo SamsungOrder = new OrderInfo(1, "chennai", 101, 201, "15,640");
            OrderInfo MIOrder = new OrderInfo(2, "mumbai", 102, 202, "20,999");
            OrderInfo OppoOrder = new OrderInfo(3, "aligarh", 103, 203, "49,999");
            OrderInfo IPhoneOrder = new OrderInfo(4, "noida", 104, 204, "100000");

 

            // adding map list of collections in java
            orderIdMap.put(1, SamsungOrder);
            orderIdMap.put(4, MIOrder);
            orderIdMap.put(3, OppoOrder);
            orderIdMap.put(2, IPhoneOrder);
        }
    }

 

    public List<OrderInfo> getAllOrderlist() {
        List<OrderInfo> orderlist = new ArrayList<OrderInfo>(orderIdMap.values());
        return orderlist;
    }

 

    public OrderInfo getOrder(int id) {
        OrderInfo Order = orderIdMap.get(id);
        return Order;
    }

 

    // add Product
    public OrderInfo addOrder(OrderInfo order) {
        order.setOrder_id(getMaxId() + 1);
        // key , value
        orderIdMap.put(order.getOrder_id(), order); /// logic class
        return order;
    }

 

    // update
    public OrderInfo updateOrder(OrderInfo order) {
        if (order.getOrder_id() <= 0)
            return null;
        orderIdMap.put(order.getOrder_id(), order);
        return order;
    }
    // delete

 

    public void deleteOrder(int id)

 

    {
        orderIdMap.remove(id);
    }

 

    public static HashMap<Integer, OrderInfo> getOrderIdMap()

 

    {

 

        return orderIdMap;
    }

 

    // Utility method to get max id
    public static int getMaxId() {
        int max = 0;
        for (int id : orderIdMap.keySet()) {
            if (max <= id)
                max = id;
        }
        return max;
    }
}