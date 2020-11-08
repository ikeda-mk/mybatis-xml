package com.example.ec.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDetail {
    private Long id;
    private Date orderedAt;
    private Date deliveredAt;
    private Long customerId;
    private Integer orderStatusId;

    private Customer customer;
    private List<Product> products;

}
