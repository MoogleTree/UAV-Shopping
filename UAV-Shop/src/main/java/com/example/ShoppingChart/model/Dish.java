package com.example.ShoppingChart.model;


public class Dish {

    private String dishName;
    private double dishPrice;
    private Long dishAmount = 0L;
    private Long dishRemain = 100000L;
    private Long dishID;
    private String itemDescription;
    private String dishImage;

    public Dish(String dishName,double dishPrice, Long dishID, String dishImage
               // String itemDescription, String itemImagine
    ){
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dishID=dishID;
        this.dishImage = dishImage;
        //this.itemDescription=itemDescription;
        //this.itemImagine=itemImagine;
    }


    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Long getDishAmount() {
        return dishAmount;
    }

    public String getDishImage() {
        return dishImage;
    }

    public void setDishAmount(Long dishAmount) {
        this.dishAmount = dishAmount;
    }

    public Long getDishRemain() {
        return dishRemain;
    }

    public Long getDishID() {return dishID;}

    //public String getItemDescription() {return itemDescription;}

   // public String getItemImagine() {return  itemImagine;}

    public void setDishRemain(Long dishRemain) {
        this.dishRemain = dishRemain;
    }

    public int hashCode(){
        int code = this.dishName.hashCode()+(int)this.dishPrice;
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;

        return obj instanceof Dish &&
                this.dishName.equals(((Dish)obj).dishName) &&
                this.dishPrice ==  ((Dish)obj).dishPrice &&
                this.dishAmount == ((Dish)obj).dishAmount &&
                this.dishRemain == ((Dish)obj).dishRemain &&
                this.dishID == ((Dish)obj).dishID;
    }
}
