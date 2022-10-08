package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int total;

    private boolean extraCheese = false;

    private boolean extraToppings = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        total = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            total += 80;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(!extraToppings){
            if(isVeg){
                total += 70;
            }else{
                total += 120;
            }
            extraToppings = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        total += 20;
    }

    public String getBill(){
        // your code goes here
        bill = Integer.toString(this.total);
        return this.bill;
    }
}
