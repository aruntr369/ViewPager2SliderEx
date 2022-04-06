package com.arun.viewpager2sliderex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.arun.viewpager2sliderex.databinding.ActivityMainBinding;
import com.arun.viewpager2sliderex.fragments.FragmentViewPagerActivity;
import com.arun.viewpager2sliderex.views.ViewsSliderActivity;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnViewsDemo.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ViewsSliderActivity.class));
        });

        binding.btnFragmentDemo.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FragmentViewPagerActivity.class));
        });
    }
}