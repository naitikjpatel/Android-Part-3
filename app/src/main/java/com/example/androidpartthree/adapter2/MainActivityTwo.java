package com.example.androidpartthree.adapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidpartthree.R;

public class MainActivityTwo extends AppCompatActivity {

    ListView listView;

    int images[]={R.drawable.backg,R.drawable.d1,R.drawable.images,R.drawable.th};
    String[] name={"naitik","jay","mango","don"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        listView=findViewById(R.id.listview);

        MyAdapterTwo myAdapterTwo=new MyAdapterTwo(images,name,MainActivityTwo.this);
        listView.setAdapter(myAdapterTwo);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivityTwo.this, "Clicked :"+name[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}