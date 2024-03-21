package org.ies.tierno.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Orders {
    private int id;
    private Date date;
    private Double price;
    private List<Items> items;
}
