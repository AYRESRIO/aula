package com.devsuperior.entities;

public class Order  {
    private Integer code;
    private Double base;
    private Double discount;

    public Order() {
    }
    public Order(Integer code, Double base, Double discount) {
        this.code = code;
        this.base = base;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

}
