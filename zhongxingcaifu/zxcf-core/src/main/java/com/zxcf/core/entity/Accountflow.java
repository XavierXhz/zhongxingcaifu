package com.zxcf.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Accountflow {
    private Long id;

    private BigDecimal amount;

    private String note;

    private Date tradetime;

    private Byte actiontype;

    private Long accountId;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }

    public Byte getActiontype() {
        return actiontype;
    }

    public void setActiontype(Byte actiontype) {
        this.actiontype = actiontype;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
}