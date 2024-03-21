package org.ies.tierno.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Set<String> tags;
}
