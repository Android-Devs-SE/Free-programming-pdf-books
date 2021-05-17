package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AndroidActivity extends AppCompatActivity {

    ImageView e,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        e = findViewById(R.id.e);
        h = findViewById(R.id.h);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (AndroidActivity.this,JavaActivity.class);
                startActivity(intent);

            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (AndroidActivity.this,KotlinActivity.class);
                startActivity(intent);

            }
        });

    }
}