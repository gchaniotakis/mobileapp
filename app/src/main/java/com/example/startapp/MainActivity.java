package com.example.startapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

   ListView lv;


   String[] images;
   String[] titleList;
   String [] descList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        titleList = getResources().getStringArray(R.array.Languages);
        descList = getResources().getStringArray(R.array.LanguageDesc);
        images = getResources().getStringArray(R.array.LanguageImage);

        lv = (ListView)findViewById(R.id.listView);

        Adapter adapter = new Adapter(this,titleList,descList,images);

        lv.setAdapter(adapter);


    }
}
