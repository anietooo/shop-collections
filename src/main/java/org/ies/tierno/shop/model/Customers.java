package org.ies.tierno.shop.model;

import java.util.List;
import java.util.Objects;

public class Customers {
    private String nif;
    private String name;
    private String surname;
    private List<Orders> orders;

    public Customers(String nif, String name, String surname, List<Orders> ordersList) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.orders = ordersList;
    }

    public Customers() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customer = (Customers) o;
        return Objects.equals(nif, customer.nif) && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(orders, customer.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, orders);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ordersList=" + orders +
                '}';
    }
}
