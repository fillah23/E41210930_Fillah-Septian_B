package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLayout();


    }
    private void getLayout(){
        LinearLayout linear = findViewById(R.id.activity_linear);
        linear.setOnClickListener(v -> {
            Intent in = new Intent(this, linear.class);
            startActivity(in);
        });

        LinearLayout relative = findViewById(R.id.activity_relative);
        relative.setOnClickListener(v -> {
            Intent in = new Intent(this, relative.class);
            startActivity(in);
        });

        LinearLayout constraint = findViewById(R.id.activity_constraint);
        constraint.setOnClickListener(v -> {
            Intent in = new Intent(this, constraint.class);
            startActivity(in);
        });

        LinearLayout frame = findViewById(R.id.activity_frame);
        frame.setOnClickListener(v -> {
            Intent in = new Intent(this, framelayout.class);
            startActivity(in);
        });
        LinearLayout table = findViewById(R.id.activity_table);
        table.setOnClickListener(v -> {
            Intent in = new Intent(this, tablelayout.class);
            startActivity(in);
        });
        LinearLayout Scroll_view = findViewById(R.id.activity_scroll_view);
        Scroll_view.setOnClickListener(v -> {
            Intent in = new Intent(this, scrollViewVertical.class);
            startActivity(in);
        });
        LinearLayout Scroll_view_hor = findViewById(R.id.activity_horizontalscrollview);
        Scroll_view_hor.setOnClickListener(v -> {
            Intent in = new Intent(this, scrollViewHorizontal.class);
            startActivity(in);
        });
        LinearLayout materiall = findViewById(R.id.activity_material);
        materiall.setOnClickListener(v -> {
            Intent in = new Intent(this, material.class);
            startActivity(in);
        });

    }
}