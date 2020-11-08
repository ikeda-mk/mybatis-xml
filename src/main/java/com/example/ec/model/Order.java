package com.example.ec.model;

import com.example.ec.constant.OrderStatus;
import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private Long id;
    private Date orderedAt;
    private Date deliveredAt;
    private Long customerId;
    private OrderStatus orderStatus;

}