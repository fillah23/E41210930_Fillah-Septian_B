package com.example.apkmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button 1 untuk menampilkan activity list view

        Button blistciew=(Button)findViewById(R.id.btlistciew);
        blistciew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,ViewList.class);
                startActivity(inten1);
            }
        });

        //button 2 untuk menampilkan activity spinner

        Button butt2=(Button)findViewById(R.id.btviewspinner);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,ViewSpinner.class);
                startActivity(inten1);
            }
        });

        //button 3 untuk menampilkan activity autocomplete

        Button butt3=(Button)findViewById(R.id.btcompleteauto);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,CompleteAuto.class);
                startActivity(inten1);
            }
        });

        //button 4 untuk menampilkan activity recycler view

        Button butt4=(Button)findViewById(R.id.btviewrecycler);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,ViewRecycler.class);
                startActivity(inten1);
            }
        });

    }
}