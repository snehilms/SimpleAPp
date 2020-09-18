package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button button1;
        private Button button2;
        private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button)findViewById(R.id.animal);
        button2= (Button)findViewById(R.id.flower);
        button3= (Button)findViewById(R.id.vegetables);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenAnimalActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenFlowerActivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenVegetableActivity();
            }
        });

    }
    public void OpenAnimalActivity()
    {
        Intent intent1 =new Intent(this,Animals_activity.class);
        startActivity(intent1);
    }
    public void OpenFlowerActivity()
    {
        Intent intent2 =new Intent(this,flower_activity.class);
        startActivity(intent2);
    }
    public void OpenVegetableActivity()
    {
        Intent intent3 =new Intent(this,Vegetable_activity.class);
        startActivity(intent3);
    }
}
