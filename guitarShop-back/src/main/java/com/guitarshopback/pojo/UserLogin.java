package com.guitarShopBack.pojo;

public class UserLogin {
    private Long ulId;

    private String ulName;

    private String ulPassword;

    private Boolean ulType;

    public Long getUlId() {
        return ulId;
    }

    public void setUlId(Long ulId) {
        this.ulId = ulId;
    }

    public String getUlName() {
        return ulName;
    }

    public void setUlName(String ulName) {
        this.ulName = ulName == null ? null : ulName.trim();
    }

    public String getUlPassword() {
        return ulPassword;
    }

    public void setUlPassword(String ulPassword) {
        this.ulPassword = ulPassword == null ? null : ulPassword.trim();
    }

    public Boolean getUlType() {
        return ulType;
    }

    public void setUlType(Boolean ulType) {
        this.ulType = ulType;
    }
}