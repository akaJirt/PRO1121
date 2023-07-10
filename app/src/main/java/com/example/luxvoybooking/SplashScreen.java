package com.example.luxvoybooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_DURATION = 5000; // 5 giây

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView imageView = findViewById(R.id.splash_image);

        RequestOptions requestOptions = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.DATA); // Không lưu cache của GIF

        Glide.with(this)
                .load(R.drawable.luxvoy_gif) // Tên của tệp GIF trong thư mục "res/drawable"
                .apply(requestOptions)
                .into(imageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Chuyển đến màn hình Onboard1 sau khi hiển thị màn hình Splash trong 5 giây
                Intent intent = new Intent(SplashScreen.this, OnboardActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }
}