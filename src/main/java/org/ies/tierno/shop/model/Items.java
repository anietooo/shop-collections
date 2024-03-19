package org.ies.tierno.shop.model;

import java.util.Objects;

public class Items {
    private int productId;
    private Double amount;

    public Items(int productId, Double amount) {
        this.productId = productId;
        this.amount = amount;
    }

    public Items() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return productId == items.productId && Objects.equals(amount, items.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, amount);
    }

    @Override
    public String toString() {
        return "Items{" +
                "productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}
