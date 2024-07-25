package com.example.androidpartthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
public class ImageSwitcher extends AppCompatActivity {

    android.widget.ImageSwitcher imageswitcher;
    Button next,prev;

    int image_id[]={R.drawable.backg,R.drawable.d1,R.drawable.images,R.drawable.th};
    int len=image_id.length-1;
    int image_inx=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);
        imageswitcher=findViewById(R.id.imageswitcher);
        next=findViewById(R.id.next);
        prev=findViewById(R.id.prev);

        //viewFactory interface che
        imageswitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);

                return imageView;
            }
        });

        imageswitcher.setImageResource(image_id[0]);




        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image_inx <len-1 ){
                    image_inx=image_inx+1;
                    imageswitcher.setImageResource(image_id[image_inx]);
                }
                else{
                    image_inx=0;
                    imageswitcher.setImageResource(image_id[image_inx]);
                }

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image_inx >0 ){
                    image_inx=image_inx-1;
                    imageswitcher.setImageResource(image_id[image_inx]);
                }
                else{
                    image_inx=len;
                    imageswitcher.setImageResource(image_id[image_inx]);
                }

            }
        });
    }
}