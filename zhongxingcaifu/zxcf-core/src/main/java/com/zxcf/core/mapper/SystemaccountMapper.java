package com.zxcf.core.mapper;

import com.zxcf.core.entity.Systemaccount;
import com.zxcf.core.entity.SystemaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemaccountMapper {
    long countByExample(SystemaccountExample example);

    int deleteByExample(SystemaccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemaccount record);

    int insertSelective(Systemaccount record);

    List<Systemaccount> selectByExample(SystemaccountExample example);

    Systemaccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemaccount record, @Param("example") SystemaccountExample example);

    int updateByExample(@Param("record") Systemaccount record, @Param("example") SystemaccountExample example);

    int updateByPrimaryKeySelective(Systemaccount record);

    int updateByPrimaryKey(Systemaccount record);
}