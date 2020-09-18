package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simpleapp.Adapters.VegetableAdapter;
import com.example.simpleapp.Models.VegetableModel;

import java.util.ArrayList;

public class Vegetable_activity extends AppCompatActivity {
    RecyclerView recyclerView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
        recyclerView3=findViewById(R.id.recycleViewVegetable);
        ArrayList<VegetableModel> list = new ArrayList<>();
        list.add(new VegetableModel(R.drawable.cabbage,"Cabbage"));
        list.add(new VegetableModel(R.drawable.spinach,"Spinach"));
        list.add(new VegetableModel(R.drawable.cauliflower,"Cauliflower"));
        list.add(new VegetableModel(R.drawable.capsicum,"Capsicum"));
        list.add(new VegetableModel(R.drawable.carrots,"Carrot"));
        VegetableAdapter adapter = new VegetableAdapter(list,this);
        recyclerView3.setAdapter((adapter));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView3.setLayoutManager(layoutManager);

    }
}
