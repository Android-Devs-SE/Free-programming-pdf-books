package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        pdfView = findViewById(R.id.pdfview);

        pdfView.useBestQuality(true);
        pdfView.enableSwipe(true);
        pdfView.fitToWidth();
        pdfView.fromAsset("CNotes.pdf").load();

    }
}