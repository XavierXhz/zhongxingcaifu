package com.zxcf.core.mapper;

import com.zxcf.core.entity.Userbankinfo;
import com.zxcf.core.entity.UserbankinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserbankinfoMapper {
    long countByExample(UserbankinfoExample example);

    int deleteByExample(UserbankinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userbankinfo record);

    int insertSelective(Userbankinfo record);

    List<Userbankinfo> selectByExample(UserbankinfoExample example);

    Userbankinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userbankinfo record, @Param("example") UserbankinfoExample example);

    int updateByExample(@Param("record") Userbankinfo record, @Param("example") UserbankinfoExample example);

    int updateByPrimaryKeySelective(Userbankinfo record);

    int updateByPrimaryKey(Userbankinfo record);
}