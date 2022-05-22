package com.geektech.homework51.model;

public class CounterModel {

    public int count = 0;

    public final String green = "#FF6200EE";
    public final String black = "#FF000000";
    public final String toast = "Поздравляем";



    public void increment(){
        ++count;
    }

    public void decrement(){
        --count;
    }

    public int getCount() {
        return count;
    }

    public String getGreen() {
        return green;
    }

    public String getBlack() {
        return black;
    }

    public String getToast() {
        return toast;
    }
}
