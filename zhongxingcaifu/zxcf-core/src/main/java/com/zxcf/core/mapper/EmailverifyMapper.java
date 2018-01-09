package com.zxcf.core.mapper;

import com.zxcf.core.entity.Emailverify;
import com.zxcf.core.entity.EmailverifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailverifyMapper {
    long countByExample(EmailverifyExample example);

    int deleteByExample(EmailverifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Emailverify record);

    int insertSelective(Emailverify record);

    List<Emailverify> selectByExample(EmailverifyExample example);

    Emailverify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Emailverify record, @Param("example") EmailverifyExample example);

    int updateByExample(@Param("record") Emailverify record, @Param("example") EmailverifyExample example);

    int updateByPrimaryKeySelective(Emailverify record);

    int updateByPrimaryKey(Emailverify record);
}