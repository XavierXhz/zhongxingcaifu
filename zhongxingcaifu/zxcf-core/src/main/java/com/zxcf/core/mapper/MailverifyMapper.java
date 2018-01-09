package com.zxcf.core.mapper;

import com.zxcf.core.entity.Mailverify;
import com.zxcf.core.entity.MailverifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailverifyMapper {
    long countByExample(MailverifyExample example);

    int deleteByExample(MailverifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Mailverify record);

    int insertSelective(Mailverify record);

    List<Mailverify> selectByExample(MailverifyExample example);

    Mailverify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Mailverify record, @Param("example") MailverifyExample example);

    int updateByExample(@Param("record") Mailverify record, @Param("example") MailverifyExample example);

    int updateByPrimaryKeySelective(Mailverify record);

    int updateByPrimaryKey(Mailverify record);
}