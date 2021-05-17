package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CompeteActivity extends AppCompatActivity {

    ImageView c,a,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compete);

        c = findViewById(R.id.c);
        a = findViewById(R.id.a);
        j= findViewById(R.id.j);


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (CompeteActivity.this,CActivity.class);
                startActivity(intent);

            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (CompeteActivity.this,CplusActivity.class);
                startActivity(intent);

            }
        });


        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (CompeteActivity.this,CsharpActivity.class);
                startActivity(intent);

            }
        });



    }
}