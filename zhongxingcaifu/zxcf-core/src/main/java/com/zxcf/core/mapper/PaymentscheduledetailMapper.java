package com.zxcf.core.mapper;

import com.zxcf.core.entity.Paymentscheduledetail;
import com.zxcf.core.entity.PaymentscheduledetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentscheduledetailMapper {
    long countByExample(PaymentscheduledetailExample example);

    int deleteByExample(PaymentscheduledetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Paymentscheduledetail record);

    int insertSelective(Paymentscheduledetail record);

    List<Paymentscheduledetail> selectByExample(PaymentscheduledetailExample example);

    Paymentscheduledetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Paymentscheduledetail record, @Param("example") PaymentscheduledetailExample example);

    int updateByExample(@Param("record") Paymentscheduledetail record, @Param("example") PaymentscheduledetailExample example);

    int updateByPrimaryKeySelective(Paymentscheduledetail record);

    int updateByPrimaryKey(Paymentscheduledetail record);
}