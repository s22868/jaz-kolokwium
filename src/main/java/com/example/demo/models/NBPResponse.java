package com.example.demo.models;

import java.util.List;

public class NBPResponse {
    private String table; //: "A",
    private String no; //: "1/A/NBP/2012",
    private String effectiveDate; //: "2012-01-02",
    private List<Rate> rates;

    public NBPResponse(String table, String no, String effectiveDate, List<Rate> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
