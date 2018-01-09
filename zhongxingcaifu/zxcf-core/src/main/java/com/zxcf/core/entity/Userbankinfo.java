package com.zxcf.core.entity;

public class Userbankinfo {
    private Long id;

    private String bankname;

    private String accountname;

    private String accountnumber;

    private String forkname;

    private Long logininfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber == null ? null : accountnumber.trim();
    }

    public String getForkname() {
        return forkname;
    }

    public void setForkname(String forkname) {
        this.forkname = forkname == null ? null : forkname.trim();
    }

    public Long getLogininfoId() {
        return logininfoId;
    }

    public void setLogininfoId(Long logininfoId) {
        this.logininfoId = logininfoId;
    }
}