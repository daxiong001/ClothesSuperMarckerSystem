package com.vince.bean;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-20 10:11
 */
public class OrderItem {

    private int itemId;
    private Clothes clothes;
    private int shoppingNum;
    private float sunm;


    public OrderItem() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public int getShoppingNum() {
        return shoppingNum;
    }

    public void setShoppingNum(int shoppingNum) {
        this.shoppingNum = shoppingNum;
    }

    public float getSunm() {
        return sunm;
    }

    public void setSunm(float sunm) {
        this.sunm = sunm;
    }
}
