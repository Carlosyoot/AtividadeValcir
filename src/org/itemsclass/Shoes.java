package org.itemsclass;

public class Shoes extends Item{   //Atributos de tenis

    private String brand;
    private String model;
    

    //Construtor logo abaixo junto com um super de items

    public Shoes(String name, int id, float price, short number, String brand, String model){
        
        super(name, id, price, number);
        
        this.brand = brand;

        this.model =  model;}


    //Getters e setters
    
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    // Método toString logo abaixo>


    @Override
    public String toString() {
        return "Detalhes dos Produtos\n"+ 
        "Tenis> {" +
                "Nome: '" + getName() + '\'' +
                ", Id: " + getId() +
                ", Valor: " + getPrice() +
                ", Numeracao: " + getNumber() +
                ", Marca: " + getBrand() + '\'' +
                ", Tipo :" + getModel() + '\'' +
                '}';
    }
}