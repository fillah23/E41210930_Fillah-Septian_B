//package com.example.jsonmoviedb;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//
//import com.rememberdev.jsonmoviedb.MovieDBActivity;
//import com.rememberdev.jsonmoviedb.R;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ImageView showJson = (ImageView) findViewById(R.id.json);
//        ImageView showJsonAPI = (ImageView) findViewById(R.id.json_api);
//        ImageView showMovieDB = (ImageView) findViewById(R.id.moviedb);
//
//        showJson.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Intent = new Intent(MainActivity.this, JsonParseActivity.class);
//                startActivity(Intent);
//            }
//        });
//        showJsonAPI.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Intent = new Intent(MainActivity.this, JsonAPIActivity.class);
//                startActivity(Intent);
//            }
//        });
//        showMovieDB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Intent = new Intent(MainActivity.this, MovieDBActivity.class);
//                startActivity(Intent);
//            }
//        });
//    }
//}