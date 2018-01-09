package com.zxcf.core.mapper;

import com.zxcf.core.entity.Platformbankinfo;
import com.zxcf.core.entity.PlatformbankinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformbankinfoMapper {
    long countByExample(PlatformbankinfoExample example);

    int deleteByExample(PlatformbankinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Platformbankinfo record);

    int insertSelective(Platformbankinfo record);

    List<Platformbankinfo> selectByExample(PlatformbankinfoExample example);

    Platformbankinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Platformbankinfo record, @Param("example") PlatformbankinfoExample example);

    int updateByExample(@Param("record") Platformbankinfo record, @Param("example") PlatformbankinfoExample example);

    int updateByPrimaryKeySelective(Platformbankinfo record);

    int updateByPrimaryKey(Platformbankinfo record);
}