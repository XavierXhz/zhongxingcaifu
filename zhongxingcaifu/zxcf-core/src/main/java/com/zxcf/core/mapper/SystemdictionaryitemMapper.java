package com.zxcf.core.mapper;

import com.zxcf.core.entity.Systemdictionaryitem;
import com.zxcf.core.entity.SystemdictionaryitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdictionaryitemMapper {
    long countByExample(SystemdictionaryitemExample example);

    int deleteByExample(SystemdictionaryitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionaryitem record);

    int insertSelective(Systemdictionaryitem record);

    List<Systemdictionaryitem> selectByExample(SystemdictionaryitemExample example);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    int updateByExample(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    int updateByPrimaryKeySelective(Systemdictionaryitem record);

    int updateByPrimaryKey(Systemdictionaryitem record);
}