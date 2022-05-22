package com.geektech.homework51.view;

public class CounterContracts {

    public interface CounterView{

        void updateText(int count);

        void setColorText(String color);

        void showToast(String toast);



    }

    public interface CounterPresenter{
        void increment();
        void decrement();

        void setColor();
        void setToast();

        void attachCounterView(CounterView view);


    }
}
