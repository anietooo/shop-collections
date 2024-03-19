package org.ies.tierno.shop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Shop {
    private String name;
    private Map<Integer, Product> productsById;
    private List<Customers> customers;

    public Shop(String name, Map<Integer, Product> productsById, List<Customers> customers) {
        this.name = name;
        this.productsById = productsById;
        this.customers = customers;
    }

    public Shop() {
    }

    /**
     * 1ER METODO
     * Devuelve un customer
     * @param nif
     * @return
     */
    public Customers getCustomerByNif(String nif) {
        for (Customers customer : customers) {
            if (customer.getNif().equals(nif)) {
                return customer;
            }
        }
        return null;
    }

    /**
     * 2º METODO
     * Devuelve un pedido
     * @param nif
     * @param id
     * @return
     */
    public Orders getCustomerOrder(String nif, int id) {
        Customers customer = getCustomerByNif(nif);
        if (customer != null) {
            for (Orders order : customer.getOrders()) {
                if (order.getId() == id) {
                    return order;
                }
            }
        }
        return null; // Order not found
    }

    /**
     * 3ER METODO
     * Devuelve un producto
     * @param productId
     * @return
     */
    public Product getProductById(int productId) {
        return productsById.get(productId);
    }

    /**
     * 4º METODO
     * Devuelve una lista
     * @param nif
     * @param id
     * @return
     */
    public List<Product> getProductsInOrder(String nif, int id) {
        Orders order = getCustomerOrder(nif, id);
        if (order != null) {
            List<Product> productsInOrder = new ArrayList<>();
            for (Items item : order.getItems()) {
                Product product = getProductById(item.getProductId());
                if (product != null) {
                    productsInOrder.add(product);
                }
            }
            return productsInOrder;
        }
        return null;
    }

    /**
     * 5º METODO
     * Saca una lista que tiene la etiqueta dada
     * @param tag
     * @return
     */
    public List<Product> getProductsByTag(String tag) {
        List<Product> productsWithTag = new ArrayList<>();
        for (Product product : productsById.values()) {
            if (product.getTags().contains(tag)) {
                productsWithTag.add(product);
            }
        }
        return productsWithTag;
    }

    /**
     * 6º METODO
     * Ver el gasto total
     * @param nif
     * @return
     */
    public double getTotalSpentByCustomer(String nif) {
        double totalSpent = 0;
        Customers customer = getCustomerByNif(nif);
        if (customer != null) {
            for (Orders order : customer.getOrders()) {
                totalSpent += order.getPrice();
            }
        }
        return totalSpent;
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

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
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
