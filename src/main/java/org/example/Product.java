package org.example;

public class Product {
    private String name;
    private String description;
    private String brand;
    private String category;
    private float list_price;
    private float cost;

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCategory(String Category) {
        this.category = category;
    }
    public void setListPrice(int list_price) {
        this.list_price = list_price;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getBrand() {
        return brand;
    }
    public String getCategory() {
        return category;
    }
    public float getListPrice() {
        return list_price;
    }
    public float getCost() {
        return cost;
    }


    
}
