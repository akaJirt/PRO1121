package com.example.luxvoybooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.luxvoybooking.Adapter.ViewPager2Adapter;

import me.relex.circleindicator.CircleIndicator3;

public class OnboardActivity extends AppCompatActivity {

    private CircleIndicator3 circleIndicator;

    private ViewPager2Adapter viewPager2Adapter;

    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        circleIndicator = findViewById(R.id.indicator);

        viewPager2Adapter = new ViewPager2Adapter(this);
        viewPager2 = findViewById(R.id.viewPager2);

        viewPager2.setAdapter(viewPager2Adapter);
        circleIndicator.setViewPager(viewPager2);
    }
}