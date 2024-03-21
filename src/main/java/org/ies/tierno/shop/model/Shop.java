package org.ies.tierno.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Shop {
    private String name;
    private Map<Integer, Product> productsById;
    private List<Customers> customers;

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
        return null;
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
}
