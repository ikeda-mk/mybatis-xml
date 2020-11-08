package com.example.ec.repository.mapper;

import com.example.ec.constant.OrderStatus;
import jdk.jshell.spi.ExecutionControl;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderStatusTypeHandler extends BaseTypeHandler<OrderStatus> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, OrderStatus orderStatus, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, orderStatus.getId());
    }

    @Override
    public OrderStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int statusId = rs.getInt(columnName);
        if (statusId == 0 && rs.wasNull()) {
            return null;
        }

        return OrderStatus.getOrderStatus(statusId);
    }

    @Override
    public OrderStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        throw new SQLException(new ExecutionControl.NotImplementedException("Not impl OrderStatusTypeHandler#getNullableResult"));
    }

    @Override
    public OrderStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        throw new SQLException(new ExecutionControl.NotImplementedException("Not impl OrderStatusTypeHandler#getNullableResult"));
    }
}
