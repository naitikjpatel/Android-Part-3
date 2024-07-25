package com.example.androidpartthree.adapter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.androidpartthree.R;

public class MainActivityOne extends AppCompatActivity {


    GridView gridview;

    int images[]={R.drawable.backg,R.drawable.images,R.drawable.d1,R.drawable.backg,R.drawable.images,R.drawable.d1,R.drawable.backg,R.drawable.images,R.drawable.d1,R.drawable.backg,R.drawable.images,R.drawable.d1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);
        gridview=findViewById(R.id.gridview);
        MyAdaptorOne myAdaptorOne=new MyAdaptorOne(MainActivityOne.this,images);
        gridview.setAdapter(myAdaptorOne);

    }
}