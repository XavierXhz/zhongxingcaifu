package com.zxcf.core.mapper;

import com.zxcf.core.entity.Accountflow;
import com.zxcf.core.entity.AccountflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountflowMapper {
    long countByExample(AccountflowExample example);

    int deleteByExample(AccountflowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Accountflow record);

    int insertSelective(Accountflow record);

    List<Accountflow> selectByExample(AccountflowExample example);

    Accountflow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Accountflow record, @Param("example") AccountflowExample example);

    int updateByExample(@Param("record") Accountflow record, @Param("example") AccountflowExample example);

    int updateByPrimaryKeySelective(Accountflow record);

    int updateByPrimaryKey(Accountflow record);
}