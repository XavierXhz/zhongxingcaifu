package com.zxcf.core.mapper;

import com.zxcf.core.entity.Logininfo;
import com.zxcf.core.entity.LogininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogininfoMapper {
    long countByExample(LogininfoExample example);

    int deleteByExample(LogininfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    int insertSelective(Logininfo record);

    List<Logininfo> selectByExample(LogininfoExample example);

    Logininfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Logininfo record, @Param("example") LogininfoExample example);

    int updateByExample(@Param("record") Logininfo record, @Param("example") LogininfoExample example);

    int updateByPrimaryKeySelective(Logininfo record);

    int updateByPrimaryKey(Logininfo record);
}