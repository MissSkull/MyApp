package com.example.administrator.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button film = (Button) findViewById(R.id.film);
        final Button stock = (Button) findViewById(R.id.stock);
        final Button xyz = (Button) findViewById(R.id.xyzReader);
        final Button news = (Button) findViewById(R.id.news);
        final Button gd = (Button) findViewById(R.id.graduationDesign);

        film.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Toast.makeText(MainActivity.this, "启动应用：热门电影", Toast.LENGTH_LONG).show();}
        });
        stock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Toast.makeText(MainActivity.this, "启动应用：股市雄鹰", Toast.LENGTH_LONG).show();}
        });
        xyz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Toast.makeText(MainActivity.this, "启动应用：XYZ阅读器", Toast.LENGTH_LONG).show();}
        });
        news.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Toast.makeText(MainActivity.this, "启动应用：最新闻", Toast.LENGTH_LONG).show();}
        });
        gd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Toast.makeText(MainActivity.this, "启动应用：毕业设计", Toast.LENGTH_LONG).show();}
        });
    }
}
