package org.ies.tierno.shop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Shop {
    private String name;
    private Map<Integer, Product> productsById;
    private List<Customer> customers;

    public Shop(String name, Map<Integer, Product> productsById, List<Customer> customers) {
        this.name = name;
        this.productsById = productsById;
        this.customers = customers;
    }

    public Shop() {
    }

    /**
     * 1ER METODO
     * Devuelve un customer
     *
     * @param nif
     * @return
     */
    public Customer getCustomerByNif(String nif) {
        for (Customer customer : customers) {
            if (customer.getNif().equals(nif)) {
                return customer;
            }
        }
        return null;
    }

    /**
     * 2º METODO
     * Devuelve un pedido
     *
     * @param nif
     * @param id
     * @return
     */
    public Order getCustomerOrder(String nif, int id) {
        Customer customer = getCustomerByNif(nif);
        if (customer != null) {
            for (Order order : customer.getOrdersList()) {
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
     *
     * @param productId
     * @return
     */
    public Product getProductById(int productId) {
        return productsById.get(productId);
    }

    /**
     * 4º METODO
     * Devuelve una lista
     *
     * @param nif
     * @param id
     * @return
     */
    public List<Product> getProductsInOrder(String nif, int id) {
        Order order = getCustomerOrder(nif, id);
        if (order != null) {
            List<Product> productsInOrder = new ArrayList<>();
            for (Items item : order.getItemsList()) {
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
     *
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
     *
     * @param nif
     * @return
     */
    public double getTotalSpentByCustomer(String nif) {
        double totalSpent = 0;
        Customer customer = getCustomerByNif(nif);
        if (customer != null) {
            for (Order order : customer.getOrdersList()) {
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
