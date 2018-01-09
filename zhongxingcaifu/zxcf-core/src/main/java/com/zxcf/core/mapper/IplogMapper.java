package com.zxcf.core.mapper;

import com.zxcf.core.entity.Iplog;
import com.zxcf.core.entity.IplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IplogMapper {
    long countByExample(IplogExample example);

    int deleteByExample(IplogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Iplog record);

    int insertSelective(Iplog record);

    List<Iplog> selectByExample(IplogExample example);

    Iplog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Iplog record, @Param("example") IplogExample example);

    int updateByExample(@Param("record") Iplog record, @Param("example") IplogExample example);

    int updateByPrimaryKeySelective(Iplog record);

    int updateByPrimaryKey(Iplog record);
}