package com.zxcf.core.mapper;

import com.zxcf.core.entity.Realauth;
import com.zxcf.core.entity.RealauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealauthMapper {
    long countByExample(RealauthExample example);

    int deleteByExample(RealauthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Realauth record);

    int insertSelective(Realauth record);

    List<Realauth> selectByExample(RealauthExample example);

    Realauth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Realauth record, @Param("example") RealauthExample example);

    int updateByExample(@Param("record") Realauth record, @Param("example") RealauthExample example);

    int updateByPrimaryKeySelective(Realauth record);

    int updateByPrimaryKey(Realauth record);
}