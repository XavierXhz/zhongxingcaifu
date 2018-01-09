package com.zxcf.core.mapper;

import com.zxcf.core.entity.Videoauth;
import com.zxcf.core.entity.VideoauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoauthMapper {
    long countByExample(VideoauthExample example);

    int deleteByExample(VideoauthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Videoauth record);

    int insertSelective(Videoauth record);

    List<Videoauth> selectByExample(VideoauthExample example);

    Videoauth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Videoauth record, @Param("example") VideoauthExample example);

    int updateByExample(@Param("record") Videoauth record, @Param("example") VideoauthExample example);

    int updateByPrimaryKeySelective(Videoauth record);

    int updateByPrimaryKey(Videoauth record);
}