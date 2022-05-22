package com.geektech.homework51;

import com.geektech.homework51.presenter.CounterPresenter;

public class Injector {

    public static CounterPresenter getCounterPresenter(){
        return new CounterPresenter();
    }
}
