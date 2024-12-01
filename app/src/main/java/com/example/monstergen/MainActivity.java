package com.example.monstergen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Spinner opSpinner;
    private Button genButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opSpinner = findViewById(R.id.typeSpinner);
        genButton = findViewById(R.id.genButton);

        String[] options = {"Choose a type!","Aquatic","Creepy","Gross","Cute","Lovecraftian"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,options);
        opSpinner.setAdapter(adapter);

        genButton.setOnClickListener(new View.OnClickListener(){
            //If opspinner=choose, toast, else move to next activity with values.
            @Override
            public void onClick(View view){

                if (opSpinner.getSelectedItem().toString()=="Choose a type!"){
                    Toast.makeText(MainActivity.this,"Please choose an option.",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent getMonType = new Intent(MainActivity.this, resultActivity.class);
                    getMonType.putExtra("type", opSpinner.getSelectedItem().toString());
                    startActivity(getMonType);
                }
            }


        });

    }

    @Override
    protected void onResume(){

        super.onResume();
    }
}