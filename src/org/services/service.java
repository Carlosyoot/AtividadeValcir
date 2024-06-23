package org.services;

import org.itemsclass.Item; import java.util.ArrayList; import java.util.List;

public class service {
    
    private List<Item> itens;

    public service(){
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item){
        itens.add(item);
    }

    public List<Item> listItens(){
        return itens;
    }

}
