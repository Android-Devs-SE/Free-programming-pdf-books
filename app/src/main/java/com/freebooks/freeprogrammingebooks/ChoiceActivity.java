package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class ChoiceActivity extends AppCompatActivity {

    TextView webcourse,ai,cp,cpp;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        webcourse = findViewById(R.id.webcourse);
        ai = findViewById(R.id.aicourse);
        cp = findViewById(R.id.cp);
        cpp = findViewById(R.id.cpp);


        webcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent (ChoiceActivity.this,WebActivity.class);
                startActivity(intent);
            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent (ChoiceActivity.this,AndroidActivity.class);
                startActivity(intent);
            }
        });

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent (ChoiceActivity.this,AiActivity.class);
                startActivity(intent);
            }
        });

        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent (ChoiceActivity.this,CompeteActivity.class);
                startActivity(intent);
            }
        });

    }
}