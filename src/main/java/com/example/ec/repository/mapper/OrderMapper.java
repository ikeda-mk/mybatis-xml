package com.example.ec.repository.mapper;

import com.example.ec.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Order record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Order record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Order selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Order record);
}