package org.ies.tierno.shop.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    private int id;
    private Date date;
    private Double price;
    private List<Items> itemsList;

    public Order(int id, Date date, Double price, List<Items> itemsList) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.itemsList = itemsList;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order orders = (Order) o;
        return id == orders.id && Objects.equals(date, orders.date) && Objects.equals(price, orders.price) && Objects.equals(itemsList, orders.itemsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, price, itemsList);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", price=" + price +
                ", itemsList=" + itemsList +
                '}';
    }
}
