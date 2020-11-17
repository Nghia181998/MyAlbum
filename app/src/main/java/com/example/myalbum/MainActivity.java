package com.example.myalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridview;
    ImageAdapter imageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageAdapter = new ImageAdapter(MainActivity.this);
        gridview = (GridView) findViewById(R.id.gl_images_activity_main);
        gridview.setAdapter(imageAdapter);
    }
}