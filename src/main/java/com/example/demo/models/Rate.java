package com.example.demo.models;

public class Rate {
    private String currency; //: "bat (Tajlandia)",
    private String code; //: "THB",
    private Double mid; // 0.1095

    public Rate(String currency, String code, Double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }
}
