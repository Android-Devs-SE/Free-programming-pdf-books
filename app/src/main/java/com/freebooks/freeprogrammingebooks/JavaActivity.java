package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class JavaActivity extends AppCompatActivity {

    private PDFView pdfView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        pdfView5 = findViewById(R.id.pdf5);

        pdfView5.useBestQuality(true);
        pdfView5.enableSwipe(true);
        pdfView5.fitToWidth();
        pdfView5.fromAsset("Java.pdf").load();

    }
}