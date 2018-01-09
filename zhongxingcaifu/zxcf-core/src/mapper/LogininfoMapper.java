package mapper;

import main.java.com.zxcf.core.entity.Logininfo;

public interface LogininfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    int insertSelective(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Logininfo record);

    int updateByPrimaryKey(Logininfo record);
}