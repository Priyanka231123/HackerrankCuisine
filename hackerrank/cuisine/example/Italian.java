package com.hackerrank.cuisine.example;

public class Italian extends Cuisine {
    private String dish;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
    @Override
    public Cuisine serveFood(String dish) {
        setDish(dish);
        return this;
    }
}
