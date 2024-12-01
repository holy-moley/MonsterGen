package com.example.monstergen;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class resultActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        Intent i = getIntent();
        String type =i.getStringExtra("type");
        TextView text = findViewById(R.id.monText);

        MonsterBuilder monBuild = new MonsterBuilder(type);
        Monster mon = monBuild.generate();
        text.setText(mon.getDescription());

        //Simple back button.
        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent b = new Intent(resultActivity.this,MainActivity.class);
                startActivity(b);

            }

        });



    }
}
