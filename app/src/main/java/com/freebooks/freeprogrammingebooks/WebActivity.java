package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

import com.github.barteksc.pdfviewer.PDFView;

public class WebActivity extends AppCompatActivity {

    ImageView b,d,f,i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        b = findViewById(R.id.b);
        d = findViewById(R.id.d);
        f = findViewById(R.id.f);
        i = findViewById(R.id.i);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WebActivity.this,HTMlActivity.class);
                startActivity(intent);


            }
        });


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WebActivity.this,CSSActivity.class);
                startActivity(intent);


            }
        });


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WebActivity.this,JSActivity.class);
                startActivity(intent);


            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WebActivity.this,PHPActivity.class);
                startActivity(intent);


            }
        });





    }
}