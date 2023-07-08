package com.example.recycleviewm5i5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recycleviewm5i5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


    }
}