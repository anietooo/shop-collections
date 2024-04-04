package org.ies.tierno.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customers implements Comparable<Customers>{
    private String nif;
    private String name;
    private String surname;
    private List<Orders> orders;

    @Override
    public int compareTo(Customers o) {
        int compare = this.surname.compareTo(o.surname);
        if (compare == 0){
            compare = this.name.compareTo(o.name);
            if (compare == 0){
                compare = this.nif.compareTo(o.nif);
            }
        }
        return compare;
    }
}
