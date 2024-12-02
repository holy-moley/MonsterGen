package com.example.monstergen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.monstergen.monsterdirector.MonsterDirector;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        Intent i = getIntent();
        String type = i.getStringExtra("type");
        TextView text = findViewById(R.id.monsterText);

        assert type != null;
        Monster monster = MonsterDirector.generateMonster(type);
        text.setText(monster.getDescription());

        //Simple back button.
        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(v -> {
            Intent b = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(b);
        });
    }
}
