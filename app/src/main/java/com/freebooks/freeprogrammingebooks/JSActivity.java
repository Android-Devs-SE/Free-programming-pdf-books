package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class JSActivity extends AppCompatActivity {

    private PDFView pdfView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_s);

        pdfView4 = findViewById(R.id.pdfview4);

        pdfView4.useBestQuality(true);
        pdfView4.enableSwipe(true);
        pdfView4.fitToWidth();
        pdfView4.fromAsset("Javascript.pdf").load();

    }
}