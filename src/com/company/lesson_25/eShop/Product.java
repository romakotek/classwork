package com.company.lesson_25.eShop;

public class Product {
    private String name;
    private int price;
    private Rating rating;

    public Product(String name, int price, Rating rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    enum Rating{
        EXCELLENT,
        GOOD,
        NORMAL,
        BAD,
        THE_WORST
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name=name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

}
