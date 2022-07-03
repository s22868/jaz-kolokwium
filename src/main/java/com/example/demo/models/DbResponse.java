package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class DbResponse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Double avg;
private Integer numberOfCurrencies;
private String fromDate;
private String toDate;
private LocalDateTime createdAt = LocalDateTime.now();

public DbResponse() {
        }

public DbResponse(Long id, Double avg, Integer numberOfCurrencies, String fromDate, String toDate, LocalDateTime createdAt) {
        this.id = id;
        this.avg = avg;
        this.numberOfCurrencies = numberOfCurrencies;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.createdAt = createdAt;
        }

public DbResponse(Double avg, Integer numberOfCurrencie, String fromDate, String toDate) {
        this.avg = avg;
        this.numberOfCurrencies = numberOfCurrencies;
        this.fromDate = fromDate;
        this.toDate = toDate;
        }

public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }

public Double getAvg() {
        return avg;
        }

public void setAvg(Double avg) {
        this.avg = avg;
        }

    public Integer getNumberOfCurrencies() {
        return numberOfCurrencies;
    }

    public void setNumberOfCurrencies(Integer numberOfCurrencies) {
        this.numberOfCurrencies = numberOfCurrencies;
    }

    public String getFromDate() {
        return fromDate;
        }

public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
        }

public String getToDate() {
        return toDate;
        }

public void setToDate(String toDate) {
        this.toDate = toDate;
        }

public LocalDateTime getCreatedAt() {
        return createdAt;
        }

        }