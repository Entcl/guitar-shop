package com.guitarShopBack.pojo;

public class UserInfomation {
    private Integer uiId;

    private String uiName;

    private String uiAddress;

    private String uiPhone;

    private Integer uiZip;

    private String uiEmail;

    private Long ulId;

    private String uiAvatar;

    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    public String getUiName() {
        return uiName;
    }

    public void setUiName(String uiName) {
        this.uiName = uiName == null ? null : uiName.trim();
    }

    public String getUiAddress() {
        return uiAddress;
    }

    public void setUiAddress(String uiAddress) {
        this.uiAddress = uiAddress == null ? null : uiAddress.trim();
    }

    public String getUiPhone() {
        return uiPhone;
    }

    public void setUiPhone(String uiPhone) {
        this.uiPhone = uiPhone == null ? null : uiPhone.trim();
    }

    public Integer getUiZip() {
        return uiZip;
    }

    public void setUiZip(Integer uiZip) {
        this.uiZip = uiZip;
    }

    public String getUiEmail() {
        return uiEmail;
    }

    public void setUiEmail(String uiEmail) {
        this.uiEmail = uiEmail == null ? null : uiEmail.trim();
    }

    public Long getUlId() {
        return ulId;
    }

    public void setUlId(Long ulId) {
        this.ulId = ulId;
    }

    public String getUiAvatar() {
        return uiAvatar;
    }

    public void setUiAvatar(String uiAvatar) {
        this.uiAvatar = uiAvatar == null ? null : uiAvatar.trim();
    }
}