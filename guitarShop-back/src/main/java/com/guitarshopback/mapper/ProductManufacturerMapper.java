package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.ProductManufacturer;
import com.guitarShopBack.pojo.ProductManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductManufacturerMapper {
    int countByExample(ProductManufacturerExample example);

    int deleteByExample(ProductManufacturerExample example);

    int deleteByPrimaryKey(Long pmId);

    int insert(ProductManufacturer record);

    int insertSelective(ProductManufacturer record);

    List<ProductManufacturer> selectByExample(ProductManufacturerExample example);

    ProductManufacturer selectByPrimaryKey(Long pmId);

    int updateByExampleSelective(@Param("record") ProductManufacturer record, @Param("example") ProductManufacturerExample example);

    int updateByExample(@Param("record") ProductManufacturer record, @Param("example") ProductManufacturerExample example);

    int updateByPrimaryKeySelective(ProductManufacturer record);

    int updateByPrimaryKey(ProductManufacturer record);
}