package com.guitarShopBack.pojo;

public class ProductInfomation {
    private Long piId;

    private String piName;

    private Double piPrice;

    private Double piDiscount;

    private String piType;

    private Integer piAmount;

    private Integer piStock;

    private Integer ptId;

    private Long pmId;

    public Long getPiId() {
        return piId;
    }

    public void setPiId(Long piId) {
        this.piId = piId;
    }

    public String getPiName() {
        return piName;
    }

    public void setPiName(String piName) {
        this.piName = piName == null ? null : piName.trim();
    }

    public Double getPiPrice() {
        return piPrice;
    }

    public void setPiPrice(Double piPrice) {
        this.piPrice = piPrice;
    }

    public Double getPiDiscount() {
        return piDiscount;
    }

    public void setPiDiscount(Double piDiscount) {
        this.piDiscount = piDiscount;
    }

    public String getPiType() {
        return piType;
    }

    public void setPiType(String piType) {
        this.piType = piType == null ? null : piType.trim();
    }

    public Integer getPiAmount() {
        return piAmount;
    }

    public void setPiAmount(Integer piAmount) {
        this.piAmount = piAmount;
    }

    public Integer getPiStock() {
        return piStock;
    }

    public void setPiStock(Integer piStock) {
        this.piStock = piStock;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }
}