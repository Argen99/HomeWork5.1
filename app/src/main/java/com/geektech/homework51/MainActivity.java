package com.geektech.homework51;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geektech.homework51.databinding.ActivityMainBinding;
import com.geektech.homework51.presenter.CounterPresenter;
import com.geektech.homework51.view.CounterContracts;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {

    private ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        presenter = Injector.getCounterPresenter();
        presenter.attachCounterView(this);
        initClickers();

    }

    private void initClickers() {
        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });

        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.tvCounter.setText(String.valueOf(count));
    }

    @Override
    public void setColorText(String color) {
        binding.tvCounter.setTextColor(Color.parseColor(color));
    }

    @Override
    public void showToast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}