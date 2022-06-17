package com.guitarShopBack.pojo;

import java.util.Date;

public class OrderInfomation {
    private Long oiId;

    private Date oiDate;

    private Integer oiStatus;

    private Integer piId;

    private Double piPrice;

    public Long getOiId() {
        return oiId;
    }

    public void setOiId(Long oiId) {
        this.oiId = oiId;
    }

    public Date getOiDate() {
        return oiDate;
    }

    public void setOiDate(Date oiDate) {
        this.oiDate = oiDate;
    }

    public Integer getOiStatus() {
        return oiStatus;
    }

    public void setOiStatus(Integer oiStatus) {
        this.oiStatus = oiStatus;
    }

    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public Double getPiPrice() {
        return piPrice;
    }

    public void setPiPrice(Double piPrice) {
        this.piPrice = piPrice;
    }
}