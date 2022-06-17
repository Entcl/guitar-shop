package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.UserInfomation;
import com.guitarShopBack.pojo.UserInfomationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfomationMapper {
    int countByExample(UserInfomationExample example);

    int deleteByExample(UserInfomationExample example);

    int deleteByPrimaryKey(Integer uiId);

    int insert(UserInfomation record);

    int insertSelective(UserInfomation record);

    List<UserInfomation> selectByExampleWithBLOBs(UserInfomationExample example);

    List<UserInfomation> selectByExample(UserInfomationExample example);

    UserInfomation selectByPrimaryKey(Integer uiId);

    int updateByExampleSelective(@Param("record") UserInfomation record, @Param("example") UserInfomationExample example);

    int updateByExampleWithBLOBs(@Param("record") UserInfomation record, @Param("example") UserInfomationExample example);

    int updateByExample(@Param("record") UserInfomation record, @Param("example") UserInfomationExample example);

    int updateByPrimaryKeySelective(UserInfomation record);

    int updateByPrimaryKeyWithBLOBs(UserInfomation record);

    int updateByPrimaryKey(UserInfomation record);
}