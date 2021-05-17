package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CSSActivity extends AppCompatActivity {

    private PDFView pdfView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_s_s);

        pdfView9 = findViewById(R.id.pdf9);

        pdfView9.useBestQuality(true);
        pdfView9.enableSwipe(true);
        pdfView9.fitToWidth();
        pdfView9.fromAsset("CSS.pdf").load();

    }
}