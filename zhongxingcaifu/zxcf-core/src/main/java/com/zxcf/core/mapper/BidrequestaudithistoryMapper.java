package com.zxcf.core.mapper;

import com.zxcf.core.entity.Bidrequestaudithistory;
import com.zxcf.core.entity.BidrequestaudithistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidrequestaudithistoryMapper {
    long countByExample(BidrequestaudithistoryExample example);

    int deleteByExample(BidrequestaudithistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bidrequestaudithistory record);

    int insertSelective(Bidrequestaudithistory record);

    List<Bidrequestaudithistory> selectByExample(BidrequestaudithistoryExample example);

    Bidrequestaudithistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bidrequestaudithistory record, @Param("example") BidrequestaudithistoryExample example);

    int updateByExample(@Param("record") Bidrequestaudithistory record, @Param("example") BidrequestaudithistoryExample example);

    int updateByPrimaryKeySelective(Bidrequestaudithistory record);

    int updateByPrimaryKey(Bidrequestaudithistory record);
}