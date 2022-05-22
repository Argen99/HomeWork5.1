package com.geektech.homework51.presenter;

import android.nfc.Tag;
import android.util.Log;
import android.widget.Toast;

import com.geektech.homework51.R;
import com.geektech.homework51.model.CounterModel;
import com.geektech.homework51.view.CounterContracts;

public class CounterPresenter implements CounterContracts.CounterPresenter {

    CounterModel counterModel = new CounterModel();
    CounterContracts.CounterView counterView;



    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());

        setToast();
        setColor();
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateText(counterModel.getCount());

        setToast();
        setColor();

    }

    @Override
    public void setColor() {
        if (counterModel.getCount() ==15)
            counterView.setColorText(counterModel.getGreen());
        else
            counterView.setColorText(counterModel.getBlack());
    }

    @Override
    public void setToast() {
        if (counterModel.getCount() == 10)
            counterView.showToast(counterModel.getToast());
    }

    @Override
    public void attachCounterView(CounterContracts.CounterView view) {
        counterView = view;
    }


}
