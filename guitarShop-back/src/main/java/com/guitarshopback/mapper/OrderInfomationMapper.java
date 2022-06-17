package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.OrderInfomation;
import com.guitarShopBack.pojo.OrderInfomationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfomationMapper {
    int countByExample(OrderInfomationExample example);

    int deleteByExample(OrderInfomationExample example);

    int deleteByPrimaryKey(Long oiId);

    int insert(OrderInfomation record);

    int insertSelective(OrderInfomation record);

    List<OrderInfomation> selectByExample(OrderInfomationExample example);

    OrderInfomation selectByPrimaryKey(Long oiId);

    int updateByExampleSelective(@Param("record") OrderInfomation record, @Param("example") OrderInfomationExample example);

    int updateByExample(@Param("record") OrderInfomation record, @Param("example") OrderInfomationExample example);

    int updateByPrimaryKeySelective(OrderInfomation record);

    int updateByPrimaryKey(OrderInfomation record);
}