package com.zxcf.core.mapper;

import com.zxcf.core.entity.Rechargeoffline;
import com.zxcf.core.entity.RechargeofflineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeofflineMapper {
    long countByExample(RechargeofflineExample example);

    int deleteByExample(RechargeofflineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Rechargeoffline record);

    int insertSelective(Rechargeoffline record);

    List<Rechargeoffline> selectByExample(RechargeofflineExample example);

    Rechargeoffline selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Rechargeoffline record, @Param("example") RechargeofflineExample example);

    int updateByExample(@Param("record") Rechargeoffline record, @Param("example") RechargeofflineExample example);

    int updateByPrimaryKeySelective(Rechargeoffline record);

    int updateByPrimaryKey(Rechargeoffline record);
}