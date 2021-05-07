package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KotlinActivity extends AppCompatActivity {

    private PDFView pdfView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);

        pdfView6 = findViewById(R.id.pdf6);

        pdfView6.useBestQuality(true);
        pdfView6.enableSwipe(true);
        pdfView6.fitToWidth();
        pdfView6.fromAsset("Kotlin.pdf").load();

    }
}