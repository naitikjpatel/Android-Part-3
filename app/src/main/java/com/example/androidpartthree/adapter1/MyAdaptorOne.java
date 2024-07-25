package com.example.androidpartthree.adapter1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.androidpartthree.ImageSwitcher;
import com.example.androidpartthree.R;

public class MyAdaptorOne extends BaseAdapter {

    Context context;
    int data[];
    LayoutInflater inflater;

    MyAdaptorOne(Context context,int data[]){
        this.context=context;
        this.data=data;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
//howmany items present in our DataSource
        return this.data.length;
    }

    @Override
    public Object getItem(int position) {
        //which item seleted that item position
        return null;
    }

    @Override
    public long getItemId(int position) {
//selected item id
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //data ne view par set karshe
        //ui_view_one ma set thashe then after aa gridView ma set thashe

//        view ne get karava ma layoutinflator no use karvo pade
        View v=inflater.inflate(R.layout.ui_one,null);
        ImageView imageView=v.findViewById(R.id.imageview);
        imageView.setImageResource(this.data[position]);
        return v;
    }
}
