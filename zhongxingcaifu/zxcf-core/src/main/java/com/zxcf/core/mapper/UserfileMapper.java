package com.zxcf.core.mapper;

import com.zxcf.core.entity.Userfile;
import com.zxcf.core.entity.UserfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserfileMapper {
    long countByExample(UserfileExample example);

    int deleteByExample(UserfileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userfile record);

    int insertSelective(Userfile record);

    List<Userfile> selectByExample(UserfileExample example);

    Userfile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userfile record, @Param("example") UserfileExample example);

    int updateByExample(@Param("record") Userfile record, @Param("example") UserfileExample example);

    int updateByPrimaryKeySelective(Userfile record);

    int updateByPrimaryKey(Userfile record);
}