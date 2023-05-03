package com.example.retrovolley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.retrovolley.activity.RetrofitActivity;
import com.example.retrovolley.activity.VolleyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionRetrofit(View view) {
        Intent retrofit = new Intent(MainActivity.this, RetrofitActivity.class);
        startActivity(retrofit);
    }

    public void actionVolley(View view) {
        Intent volley = new Intent(MainActivity.this, VolleyActivity.class);
        startActivity(volley);
    }
}