package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simpleapp.Adapters.AnimalAdapter;
import com.example.simpleapp.Models.AnimalModel;

import java.util.ArrayList;

public class Animals_activity extends AppCompatActivity {
        RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        recyclerView=findViewById(R.id.recyclarView);
    ArrayList <AnimalModel> list = new ArrayList<>();
    list.add(new AnimalModel(R.drawable.lion,"Lion"));
    list.add(new AnimalModel(R.drawable.leopard,"Leopard"));
    list.add(new AnimalModel(R.drawable.eagle,"Eagle"));
    list.add(new AnimalModel(R.drawable.rhino,"Rhino"));
    list.add(new AnimalModel(R.drawable.croc,"Crocodile"));

        AnimalAdapter adapter = new AnimalAdapter(list,this);
        recyclerView.setAdapter((adapter));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
