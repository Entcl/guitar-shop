package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.UserBalance;
import com.guitarShopBack.pojo.UserBalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBalanceMapper {
    int countByExample(UserBalanceExample example);

    int deleteByExample(UserBalanceExample example);

    int deleteByPrimaryKey(Long ubId);

    int insert(UserBalance record);

    int insertSelective(UserBalance record);

    List<UserBalance> selectByExample(UserBalanceExample example);

    UserBalance selectByPrimaryKey(Long ubId);

    int updateByExampleSelective(@Param("record") UserBalance record, @Param("example") UserBalanceExample example);

    int updateByExample(@Param("record") UserBalance record, @Param("example") UserBalanceExample example);

    int updateByPrimaryKeySelective(UserBalance record);

    int updateByPrimaryKey(UserBalance record);
}