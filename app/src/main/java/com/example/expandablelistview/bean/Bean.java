package com.example.expandablelistview.bean;

/**
 * Created by Administrator on 2017/9/21.
 */

public class Bean {

    private String price;
    private String number;

    public Bean(String price, String number) {
        this.price = price;
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
