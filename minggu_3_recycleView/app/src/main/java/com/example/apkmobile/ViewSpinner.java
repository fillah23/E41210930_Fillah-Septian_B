package com.example.apkmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ViewSpinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_spinner);

        Spinner spinner;

        spinner = findViewById(R.id.spinner);

        //Inisialiasi Array Adapter dengan memasukkan String dari file lissary.xml untuk menampilkan array country
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.negara, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Memasukan Adapter pada Spinner
        spinner.setAdapter(adapter);

        //Mengeset listener untuk mengetahui event/aksi saat item dipilih
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(parent.getContext(),"Anda klik negara ke : "+parent.getItemIdAtPosition(position+1), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}