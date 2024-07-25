package com.example.androidpartthree.adapter2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpartthree.R;

public class MyAdapterTwo extends BaseAdapter {

    String[] name;
    int [] images;
    LayoutInflater inflater;

    Context context;
    MyAdapterTwo(int [] images,String [] name,Context context){
        this.images=images;
        this.name=name;
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=inflater.inflate(R.layout.ui_two,null);
        ImageView imageView=v.findViewById(R.id.imageview);
        TextView textView=v.findViewById(R.id.textview);
        imageView.setImageResource(this.images[position]);
        textView.setText(this.name[position]);
        return v;
    }
}
