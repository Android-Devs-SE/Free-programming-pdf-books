package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CsharpActivity extends AppCompatActivity {

    private PDFView pdfView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp);

        pdfView2 = findViewById(R.id.pdfview2);

        pdfView2.useBestQuality(true);
        pdfView2.enableSwipe(true);
        pdfView2.fitToWidth();
        pdfView2.fromAsset("CS.pdf").load();

    }
}