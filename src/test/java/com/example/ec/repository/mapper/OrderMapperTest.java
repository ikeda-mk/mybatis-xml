package com.example.ec.repository.mapper;

import com.example.ec.model.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@MybatisTest
class OrderMapperTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void insert() {
        Order order = new Order();
        order.setId(100L);
        order.setOrderedAt(new Date());
        order.setCustomerId(1L);
        order.setOrderStatusId(1);

        var cnt = orderMapper.insert(order);
        assertEquals(1, cnt);
    }

    @Test
    void selectById() {
        var order = orderMapper.selectByPrimaryKey(1L);


        assertNotNull(order);
        assertEquals(1L, order.getId());
        assertEquals(1L, order.getCustomerId());
        assertEquals(2, order.getOrderStatusId());
    }
}