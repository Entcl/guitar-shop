package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.productShoppingcart;
import com.guitarShopBack.pojo.productShoppingcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface productShoppingcartMapper {
    int countByExample(productShoppingcartExample example);

    int deleteByExample(productShoppingcartExample example);

    int deleteByPrimaryKey(Long psId);

    int insert(productShoppingcart record);

    int insertSelective(productShoppingcart record);

    List<productShoppingcart> selectByExample(productShoppingcartExample example);

    productShoppingcart selectByPrimaryKey(Long psId);

    int updateByExampleSelective(@Param("record") productShoppingcart record, @Param("example") productShoppingcartExample example);

    int updateByExample(@Param("record") productShoppingcart record, @Param("example") productShoppingcartExample example);

    int updateByPrimaryKeySelective(productShoppingcart record);

    int updateByPrimaryKey(productShoppingcart record);
}