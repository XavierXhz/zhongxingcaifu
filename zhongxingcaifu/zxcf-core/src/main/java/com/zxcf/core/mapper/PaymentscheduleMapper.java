package com.zxcf.core.mapper;

import com.zxcf.core.entity.Paymentschedule;
import com.zxcf.core.entity.PaymentscheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentscheduleMapper {
    long countByExample(PaymentscheduleExample example);

    int deleteByExample(PaymentscheduleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Paymentschedule record);

    int insertSelective(Paymentschedule record);

    List<Paymentschedule> selectByExample(PaymentscheduleExample example);

    Paymentschedule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Paymentschedule record, @Param("example") PaymentscheduleExample example);

    int updateByExample(@Param("record") Paymentschedule record, @Param("example") PaymentscheduleExample example);

    int updateByPrimaryKeySelective(Paymentschedule record);

    int updateByPrimaryKey(Paymentschedule record);
}