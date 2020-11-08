package com.example.ec.repository.mapper;

import com.example.ec.model.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    List<OrderDetail> selectAll();

    List<OrderDetail> selectMin();

}
