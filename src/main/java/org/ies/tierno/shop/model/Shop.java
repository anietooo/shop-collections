package org.ies.tierno.shop.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Shop {
    private String name;
    private Map<Integer,Product> productsById;
    private List<Customer> customers;

    public Shop(String name, Map<Integer, Product> productsById, List<Customer> customers) {
        this.name = name;
        this.productsById = productsById;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Product> getProductsById() {
        return productsById;
    }

    public void setProductsById(Map<Integer, Product> productsById) {
        this.productsById = productsById;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(productsById, shop.productsById) && Objects.equals(customers, shop.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productsById, customers);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", productsById=" + productsById +
                ", customers=" + customers +
                '}';
    }
}
