package eci.edu.cvds.Parcial.model;

public class Product {
    private String name;
    private int price;
    private Integer quantity;
    private String category;

    public Product(String name,int price,Integer quantity,String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public String getname(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public void setCategory(String category){
        this.category = category;
    }

}
