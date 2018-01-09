package com.zxcf.core.entity;

import java.math.BigDecimal;

public class Account {
    private Long id;

    private String tradepassword;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    private Integer version;

    private BigDecimal unreceiveinterest;

    private BigDecimal unreceiveprincipal;

    private BigDecimal unreturnamount;

    private BigDecimal remainborrowlimit;

    private BigDecimal borrowlimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword == null ? null : tradepassword.trim();
    }

    public BigDecimal getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(BigDecimal usableamount) {
        this.usableamount = usableamount;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getUnreceiveinterest() {
        return unreceiveinterest;
    }

    public void setUnreceiveinterest(BigDecimal unreceiveinterest) {
        this.unreceiveinterest = unreceiveinterest;
    }

    public BigDecimal getUnreceiveprincipal() {
        return unreceiveprincipal;
    }

    public void setUnreceiveprincipal(BigDecimal unreceiveprincipal) {
        this.unreceiveprincipal = unreceiveprincipal;
    }

    public BigDecimal getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(BigDecimal unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public BigDecimal getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(BigDecimal remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }

    public BigDecimal getBorrowlimit() {
        return borrowlimit;
    }

    public void setBorrowlimit(BigDecimal borrowlimit) {
        this.borrowlimit = borrowlimit;
    }
}