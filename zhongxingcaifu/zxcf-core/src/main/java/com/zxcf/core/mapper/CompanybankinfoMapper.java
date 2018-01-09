package com.zxcf.core.mapper;

import com.zxcf.core.entity.Companybankinfo;
import com.zxcf.core.entity.CompanybankinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanybankinfoMapper {
    long countByExample(CompanybankinfoExample example);

    int deleteByExample(CompanybankinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Companybankinfo record);

    int insertSelective(Companybankinfo record);

    List<Companybankinfo> selectByExample(CompanybankinfoExample example);

    Companybankinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Companybankinfo record, @Param("example") CompanybankinfoExample example);

    int updateByExample(@Param("record") Companybankinfo record, @Param("example") CompanybankinfoExample example);

    int updateByPrimaryKeySelective(Companybankinfo record);

    int updateByPrimaryKey(Companybankinfo record);
}