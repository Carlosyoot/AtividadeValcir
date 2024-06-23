package org.services;

import org.itemsclass.Shoes;

import java.util.ArrayList;
import java.util.List; import java.util.stream.Collectors;

public class serviceshoes {

    private List<Shoes> shoes;

    public serviceshoes(){
        this.shoes = new ArrayList<>();
    }

    public void addShoes(Shoes shoes){
        this.shoes.add(shoes);
    }
    
    public List<Shoes> ListShoes() {
        return shoes;
    }

    public List<Shoes> searchBrand(String brand) {
        return shoes.stream()
                .filter(t -> t.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }
}

