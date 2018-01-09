package com.zxcf.core.mapper;

import com.zxcf.core.entity.Moneywithdraw;
import com.zxcf.core.entity.MoneywithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneywithdrawMapper {
    long countByExample(MoneywithdrawExample example);

    int deleteByExample(MoneywithdrawExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Moneywithdraw record);

    int insertSelective(Moneywithdraw record);

    List<Moneywithdraw> selectByExample(MoneywithdrawExample example);

    Moneywithdraw selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Moneywithdraw record, @Param("example") MoneywithdrawExample example);

    int updateByExample(@Param("record") Moneywithdraw record, @Param("example") MoneywithdrawExample example);

    int updateByPrimaryKeySelective(Moneywithdraw record);

    int updateByPrimaryKey(Moneywithdraw record);
}