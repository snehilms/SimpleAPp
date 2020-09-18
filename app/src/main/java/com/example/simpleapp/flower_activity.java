package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simpleapp.Adapters.FlowerAdapter;
import com.example.simpleapp.Models.FlowerModel;

import java.util.ArrayList;

public class flower_activity extends AppCompatActivity {

    RecyclerView recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
        recyclerView2=findViewById(R.id.recycleViewFlower);
        ArrayList<FlowerModel> list = new ArrayList<>();
        list.add(new FlowerModel(R.drawable.hibiscus,"Hibiscus"));
        list.add(new FlowerModel(R.drawable.lavender,"Lavender"));
        list.add(new FlowerModel(R.drawable.lily,"Lily"));
        list.add(new FlowerModel(R.drawable.dandelion,"Dandelion"));
        list.add(new FlowerModel(R.drawable.rsoe,"Rose"));
        FlowerAdapter adapter = new FlowerAdapter(list,this);
        recyclerView2.setAdapter((adapter));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager);
    }
}
