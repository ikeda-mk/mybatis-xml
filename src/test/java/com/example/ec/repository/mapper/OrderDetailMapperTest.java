package com.example.ec.repository.mapper;

import com.example.ec.model.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@MybatisTest
@Slf4j
class OrderDetailMapperTest {

    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Test
    void selectAll() {
        List<OrderDetail> orders = orderDetailMapper.selectAll();

        assertNotNull(orders);
        assertEquals(3, orders.size());

        log.info(orders.toString());

        for (OrderDetail order : orders) {
            log.info(order.getId().toString());

            order.getProducts().forEach(p -> {
                log.info(p.getName());
            });
        }
    }

    @Test
    void selectMin() {
        var orders = orderDetailMapper.selectMin();

        assertNotNull(orders);
        assertEquals(3, orders.size());
    }
}