package com.zxcf.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Paymentschedule {
    private Long id;

    private Date deadline;

    private Date paydate;

    private BigDecimal totalamount;

    private BigDecimal principal;

    private BigDecimal interest;

    private BigDecimal monthindex;

    private Integer state;

    private Integer bidrequesttype;

    private Integer returntype;

    private String bidrequesttitle;

    private Long borrowuserId;

    private Long bidrequestId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getMonthindex() {
        return monthindex;
    }

    public void setMonthindex(BigDecimal monthindex) {
        this.monthindex = monthindex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Integer bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Integer getReturntype() {
        return returntype;
    }

    public void setReturntype(Integer returntype) {
        this.returntype = returntype;
    }

    public String getBidrequesttitle() {
        return bidrequesttitle;
    }

    public void setBidrequesttitle(String bidrequesttitle) {
        this.bidrequesttitle = bidrequesttitle == null ? null : bidrequesttitle.trim();
    }

    public Long getBorrowuserId() {
        return borrowuserId;
    }

    public void setBorrowuserId(Long borrowuserId) {
        this.borrowuserId = borrowuserId;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }
}