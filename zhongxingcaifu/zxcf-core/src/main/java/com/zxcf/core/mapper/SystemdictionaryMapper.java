package com.zxcf.core.mapper;

import com.zxcf.core.entity.Systemdictionary;
import com.zxcf.core.entity.SystemdictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdictionaryMapper {
    long countByExample(SystemdictionaryExample example);

    int deleteByExample(SystemdictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionary record);

    int insertSelective(Systemdictionary record);

    List<Systemdictionary> selectByExample(SystemdictionaryExample example);

    Systemdictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemdictionary record, @Param("example") SystemdictionaryExample example);

    int updateByExample(@Param("record") Systemdictionary record, @Param("example") SystemdictionaryExample example);

    int updateByPrimaryKeySelective(Systemdictionary record);

    int updateByPrimaryKey(Systemdictionary record);
}