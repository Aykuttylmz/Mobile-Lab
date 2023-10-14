package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {

    final ArrayList<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Ant", R.mipmap.mort));
        animals.add(new Animal("Bear", R.mipmap.mort));
        animals.add(new Animal("Bird", R.mipmap.mort));
        animals.add(new Animal("Cat", R.mipmap.mort));
        animals.add(new Animal("Dog", R.mipmap.mort));
        animals.add(new Animal("Ant", R.mipmap.mort));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}