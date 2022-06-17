package com.guitarShopBack.mapper;

import com.guitarShopBack.pojo.PiType;
import com.guitarShopBack.pojo.PiTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PiTypeMapper {
    int countByExample(PiTypeExample example);

    int deleteByExample(PiTypeExample example);

    int deleteByPrimaryKey(Integer ptId);

    int insert(PiType record);

    int insertSelective(PiType record);

    List<PiType> selectByExample(PiTypeExample example);

    PiType selectByPrimaryKey(Integer ptId);

    int updateByExampleSelective(@Param("record") PiType record, @Param("example") PiTypeExample example);

    int updateByExample(@Param("record") PiType record, @Param("example") PiTypeExample example);

    int updateByPrimaryKeySelective(PiType record);

    int updateByPrimaryKey(PiType record);
}