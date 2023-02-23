package com.example.apkmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ViewList extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);

        //fungsi untuk menampilkan data list ke list biew melalui adapter
        adapter = ArrayAdapter.createFromResource(this,R.array.countries_arry, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        //action click ketika di item di klik maka akan muncul text anda klik negara ke  = (posisi)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Anda Klik Negara : "+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });



    }
}