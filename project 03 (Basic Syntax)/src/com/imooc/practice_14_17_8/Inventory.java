package com.imooc.practice_14_17_8;

public class Inventory {
    //成员变量
    private String mobilePhoneModel;//手机型号
    private int inventoryLevel;//库存量

    //getter、setter方法
    public String getMobilePhoneModel() {
        return mobilePhoneModel;
    }
    public void setMobilePhoneModel(String mobilePhoneModel) {
        this.mobilePhoneModel = mobilePhoneModel;
    }
    public int getInventoryLevel() {
        return inventoryLevel;
    }
    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    //构造方法
    public Inventory() {
    }
    public Inventory(String mobilePhoneModel, int inventoryLevel) {
        this.mobilePhoneModel = mobilePhoneModel;
        this.inventoryLevel = inventoryLevel;
    }
}
