package com.example.androidpartthree.adapter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidpartthree.R;

import java.util.ArrayList;

public class MainActivityThree extends AppCompatActivity {

    ListView listView;
    ArrayList animal_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
        listView=findViewById(R.id.listview);

        //-------------------below is custom arrayList----------------
        animal_list=new ArrayList();
        animal_list.add(new Animal(R.drawable.c,"Cheta"));
        animal_list.add(new Animal(R.drawable.don,"Lion"));
        animal_list.add(new Animal(R.drawable.t,"Tiger"));
        animal_list.add(new Animal(R.drawable.t1,"Tiger1"));


        //-------------------------------------------------------------

        MyAdapter3 myAdapter3=new MyAdapter3(getApplicationContext(),R.layout.ui_three,animal_list);
        listView.setAdapter(myAdapter3);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivityThree.this, animal_list.get(position)+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}