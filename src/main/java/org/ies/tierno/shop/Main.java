package org.ies.tierno.shop;

import org.ies.tierno.shop.model.Shop;
import org.ies.tierno.shop.readers.ShopReader;

public class Main {
    public static void main(String[] args) {
        var shopReader = new ShopReader();

        Shop shop = shopReader.read();

        // Probar aquí los métodos
        //prueba

    }
}