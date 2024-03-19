package org.ies.tierno.shop.model;

import java.util.Objects;
import java.util.Set;

public class Product {
    private Integer idProduct;
    private String name;
    private Double price;
    private Set<String> tags;

    public Product(Integer idProduct, String name, Double price, Set<String> tags) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(idProduct, product.idProduct) && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(tags, product.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, name, price, tags);
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tags=" + tags +
                '}';
    }
}
