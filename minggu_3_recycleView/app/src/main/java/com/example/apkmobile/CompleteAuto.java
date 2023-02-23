package com.example.apkmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class CompleteAuto extends AppCompatActivity {

    //Daftar Item Menggunakan Array
    private static final String[] CITIES = new String[]{
            "Jember", "Pasuruan", "Probolinggo", "Malang", "Bondowoso", "Situbondo", "Surabaya", "Banyuwangi", "Bali"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_auto);

        //Membuat find view untuk mencari activity autocomplete menggunakan id
        AutoCompleteTextView editText = findViewById(R.id.CompleteAutoView);
        //Membuat Adapter untuk mengatur bagaimana Item/Konten itu tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CITIES);
        editText.setAdapter(adapter);

    }
}