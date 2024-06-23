//Boas práticas de organização por pacotes para um código limpo

package org.itemsclass;

public class Item{       //Atributos de items
    private String name;
    private int id;
    private float price;
    private short number;

    //Aqui irei fazer o construtor;

    public Item(String name, int id, float price, short number){

            this.name = name;
            this.id = id;
            this.price = price;
            this.number = number; }
    
    //Getters e setters

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public float getPrice(){
        return price;
    }

    public short getNumber(){
        return number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setNumber(short number){
        this.number = number;
    }

    //To string logo abaixo

    @Override
    public String toString() {
        return "Detalhes dos Produtos\n"
            + "Itens> {" +
                "Nome: " + name + '\'' +
                ", Id: " + id +
                ", Valor: " + price +
                ", Numeracao: " + number +
                '}';
    }
}

    
    













    

    