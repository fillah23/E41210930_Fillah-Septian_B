package com.example.apkmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ViewRecycler extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recycler);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ViewRecycler.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Akbar Rayyan Al Fath", "11012002", "081234780***"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Alif Firdaus Al Amin", "11011999", "082345890***"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Alfi Nur Hidayat", "24082001", "083456098***"));
        mahasiswaArrayList.add(new Mahasiswa("Aldi Afan Darmawan", "15041998", "0891056789***"));
    }
}