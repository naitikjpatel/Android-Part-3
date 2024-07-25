package com.example.androidpartthree.adapter3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidpartthree.R;

import java.util.ArrayList;

//This is custome array Adapter
public class MyAdapter3  extends ArrayAdapter<Animal> {

    ArrayList<Animal> animal_list;
    Context context;
    LayoutInflater inflater;
    public MyAdapter3(@NonNull Context context, int resource,ArrayList<Animal> objects) {
        super(context, resource);
        this.animal_list=objects;
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return animal_list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v=inflater.inflate(R.layout.ui_three,null);
        ImageView imageView=v.findViewById(R.id.imageview);
        TextView textView=v.findViewById(R.id.textview);

        imageView.setImageResource(animal_list.get(position).getAnimal_image());
        textView.setText(animal_list.get(position).getAnimal_name());
        return  v;
    }
}
