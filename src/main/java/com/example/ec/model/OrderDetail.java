package com.example.ec.model;

import com.example.ec.constant.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDetail {
    private Long id;
    private Date orderedAt;
    private Date deliveredAt;
    private Long customerId;
    private OrderStatus orderStatus;

    private Customer customer;
    private List<Product> products;

}
