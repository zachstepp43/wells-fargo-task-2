package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @Column(name = "portfolio_id", nullable = false)
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "client_id")
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
