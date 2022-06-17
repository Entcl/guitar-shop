package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.ProductInfomation;
import com.guitarShopBack.pojo.ProductInfomationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfomationMapper {
    int countByExample(ProductInfomationExample example);

    int deleteByExample(ProductInfomationExample example);

    int deleteByPrimaryKey(Long piId);

    int insert(ProductInfomation record);

    int insertSelective(ProductInfomation record);

    List<ProductInfomation> selectByExample(ProductInfomationExample example);

    ProductInfomation selectByPrimaryKey(Long piId);

    int updateByExampleSelective(@Param("record") ProductInfomation record, @Param("example") ProductInfomationExample example);

    int updateByExample(@Param("record") ProductInfomation record, @Param("example") ProductInfomationExample example);

    int updateByPrimaryKeySelective(ProductInfomation record);

    int updateByPrimaryKey(ProductInfomation record);
}