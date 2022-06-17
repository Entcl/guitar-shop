package com.guitarShopBack.pojo;

public class productShoppingcart {
    private Long psId;

    private Long piId;

    private Double piPrice;

    private Integer piAmount;

    private Long pmId;

    private String pmName;

    public Long getPsId() {
        return psId;
    }

    public void setPsId(Long psId) {
        this.psId = psId;
    }

    public Long getPiId() {
        return piId;
    }

    public void setPiId(Long piId) {
        this.piId = piId;
    }

    public Double getPiPrice() {
        return piPrice;
    }

    public void setPiPrice(Double piPrice) {
        this.piPrice = piPrice;
    }

    public Integer getPiAmount() {
        return piAmount;
    }

    public void setPiAmount(Integer piAmount) {
        this.piAmount = piAmount;
    }

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName == null ? null : pmName.trim();
    }
}