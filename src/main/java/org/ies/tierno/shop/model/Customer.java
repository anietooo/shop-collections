package org.ies.tierno.shop.model;

import java.util.List;
import java.util.Objects;

public class Customer {
    private String nif;
    private String name;
    private String surname;
    private List<Orders> ordersList;

    public Customer(String nif, String name, String surname, List<Orders> ordersList) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.ordersList = ordersList;
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

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(nif, customer.nif) && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(ordersList, customer.ordersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, ordersList);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}
