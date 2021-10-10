package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonPlus.setOnClickListener(v -> plusCount());
        binding.buttonMinus.setOnClickListener(v -> minusCount());
    }

    private void plusCount() {
        count++;
        updateCount();
    }

    private void minusCount() {
        count--;
        if (count < 0) {
            count = 0;
        }
        updateCount();
    }

    private void updateCount() {
        binding.counter.setText(Integer.toString(count));
    }
}