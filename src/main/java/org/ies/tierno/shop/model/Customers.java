package org.ies.tierno.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customers {
    private String nif;
    private String name;
    private String surname;
    private List<Orders> orders;
}
