package com.example.monstergen;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Spinner opSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opSpinner = findViewById(R.id.typeSpinner);

        String[] options = {"Choose a type!","Aquatic","Creepy","Gross","Cute","Lovecraftian"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,options);
        opSpinner.setAdapter(adapter);

    }

    @Override
    protected void onResume(){

        super.onResume();
    }
}