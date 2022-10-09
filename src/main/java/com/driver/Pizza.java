package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int Topping = 0;
    private int cheese = 0;

    private int paper = 0;
    private int pizza = 0;

    private boolean extraCheese = false;

    private boolean extraToppings = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            pizza = 300;
        }else{
            this.price = 400;
            pizza = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese && !extraToppings) {
            this.price += 80;
            extraCheese = true;
            cheese += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(!extraToppings){
            if(isVeg){
                this.price += 70;
                Topping += 70;
            }else{
                this.price += 120;
                Topping += 70;
            }
            extraToppings = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        this.price += 20;
        paper += 20;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: "+ Integer.toString(pizza)+"\n";
        if(extraCheese){
            bill += "Extra Cheese Added: "+Integer.toString(cheese) +"\n";
        }
        if(extraToppings){
            bill += "Extra Toppings Added: "+Integer.toString(Topping)+"\n";
        }
        if(paper > 0){
            bill +="Paperbag Added: "+Integer.toString(paper)+"\n";
        }
        bill += "Total Price: "+Integer.toString(price)+"\n";

        return this.bill;
    }
}
