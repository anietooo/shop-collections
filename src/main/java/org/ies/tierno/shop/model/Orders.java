package org.ies.tierno.shop.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Orders {
    private int id;
    private Date date;
    private Double price;
    private List<Items> items;

    public Orders(int id, Date date, Double price, List<Items> itemsList) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.items = itemsList;
    }

    public Orders() {
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

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return id == orders.id && Objects.equals(date, orders.date) && Objects.equals(price, orders.price) && Objects.equals(items, orders.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, price, items);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", price=" + price +
                ", itemsList=" + items +
                '}';
    }
}
