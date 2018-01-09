package com.zxcf.core.mapper;

import com.zxcf.core.entity.Bidrequest;
import com.zxcf.core.entity.BidrequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidrequestMapper {
    long countByExample(BidrequestExample example);

    int deleteByExample(BidrequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bidrequest record);

    int insertSelective(Bidrequest record);

    List<Bidrequest> selectByExample(BidrequestExample example);

    Bidrequest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bidrequest record, @Param("example") BidrequestExample example);

    int updateByExample(@Param("record") Bidrequest record, @Param("example") BidrequestExample example);

    int updateByPrimaryKeySelective(Bidrequest record);

    int updateByPrimaryKey(Bidrequest record);
}