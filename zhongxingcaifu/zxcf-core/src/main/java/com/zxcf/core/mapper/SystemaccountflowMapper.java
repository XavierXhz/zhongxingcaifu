package com.zxcf.core.mapper;

import com.zxcf.core.entity.Systemaccountflow;
import com.zxcf.core.entity.SystemaccountflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemaccountflowMapper {
    long countByExample(SystemaccountflowExample example);

    int deleteByExample(SystemaccountflowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemaccountflow record);

    int insertSelective(Systemaccountflow record);

    List<Systemaccountflow> selectByExample(SystemaccountflowExample example);

    Systemaccountflow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemaccountflow record, @Param("example") SystemaccountflowExample example);

    int updateByExample(@Param("record") Systemaccountflow record, @Param("example") SystemaccountflowExample example);

    int updateByPrimaryKeySelective(Systemaccountflow record);

    int updateByPrimaryKey(Systemaccountflow record);
}