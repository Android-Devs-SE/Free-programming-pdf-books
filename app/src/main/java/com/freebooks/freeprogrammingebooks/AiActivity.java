package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class AiActivity extends AppCompatActivity {

    ImageView g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);

        g = findViewById(R.id.g);

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (AiActivity.this,PythonActivity.class);
                startActivity(intent);

            }
        });

    }
}