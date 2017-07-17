package com.example.ShoppingChart.model;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.example.session.ItemPair;


public class ShopCart {
    private int shoppingAccount;//商品总数
    private double shoppingTotalPrice;//商品总价钱
    private HashMap<Dish,Integer> shoppingSingle;//每种物品的数量
    private List<ItemPair> list;

    public ShopCart(){
        this.shoppingAccount = 0;
        this.shoppingTotalPrice = 0;
        this.shoppingSingle = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public int getShoppingAccount() {
        return shoppingAccount;
    }

    public double getShoppingTotalPrice() {
        return shoppingTotalPrice;
    }

    public Map<Dish, Integer> getShoppingSingleMap() {
        return shoppingSingle;
    }

    public List<ItemPair> getItemList() {
        list.clear();
        Set<Dish> dishes = shoppingSingle.keySet();
        for (Dish dish : dishes) {
            list.add(new ItemPair(dish.getDishID(), new Long(shoppingSingle.get(dish))));
        }
        return list;
    }

    public boolean addShoppingSingle(Dish dish){
        long remain = dish.getDishRemain();
        if(remain<=0)
            return false;
        dish.setDishRemain(--remain);
        int num = 0;
        if(shoppingSingle.containsKey(dish)){
            num = shoppingSingle.get(dish);
        }
        num+=1;
        shoppingSingle.put(dish,num);
        Log.e("TAG", "addShoppingSingle: "+shoppingSingle.get(dish));

        shoppingTotalPrice += dish.getDishPrice();
        shoppingAccount++;
        return true;
    }

    public boolean subShoppingSingle(Dish dish){
        int num = 0;
        if(shoppingSingle.containsKey(dish)){
            num = shoppingSingle.get(dish);
        }
        if(num<=0) return false;
        num--;
        long remain = dish.getDishRemain();
        dish.setDishRemain(++remain);
        shoppingSingle.put(dish,num);
        if (num ==0) shoppingSingle.remove(dish);

        shoppingTotalPrice -= dish.getDishPrice();
        shoppingAccount--;
        return true;
    }

    public int getDishAccount() {
        return shoppingSingle.size();
    }

    public void clear(){
        this.shoppingAccount = 0;
        this.shoppingTotalPrice = 0;
        this.shoppingSingle.clear();
    }
}
