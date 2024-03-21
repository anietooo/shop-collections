package org.ies.tierno.shop;

import org.ies.tierno.shop.model.Shop;
import org.ies.tierno.shop.readers.ShopReader;

public class Main {
    public static void main(String[] args) {
        var shopReader = new ShopReader();

        Shop shop = shopReader.read();

        // Probar aquí los métodos
        System.out.println("CUSTOMER DADO UN NIF");
        System.out.println(shop.getCustomerByNif("1X"));

        System.out.println(" ");
        System.out.println("PEDIDO DADO UN NIF Y ID");
        System.out.println(shop.getCustomerOrder("1X",1));

        System.out.println(" ");
        System.out.println("PEDIDO DADO UN ID");
        System.out.println(shop.getProductById(1));

        System.out.println(" ");
        System.out.println("PRODUCTOS QUE SE HAN PEDIDO DADO UN NIF");
        System.out.println(shop.getProductsInOrder("1X",1));

        System.out.println(" ");
        System.out.println("VER PRODUCTOS CON UN TAG");
        System.out.println(shop.getProductsByTag("Tuerca"));

        System.out.println(" ");
        System.out.println("DINERO TOTAL GASTADO DADO UN NIF");
        System.out.println("Gasto total de la persona con NIF 1X = " + shop.getTotalSpentByCustomer("1X"));
        System.out.println("Gasto total de la persona con NIF 2X = " + shop.getTotalSpentByCustomer("2X"));
    }
}