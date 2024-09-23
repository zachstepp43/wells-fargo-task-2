package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @Column(name = "security_id", nullable = false)
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "portfolio_id")
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    public Security(String name, String category, float purchasePrice, String purchaseDate, int quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }

    public String getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
