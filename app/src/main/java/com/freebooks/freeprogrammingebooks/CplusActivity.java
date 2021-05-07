package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CplusActivity extends AppCompatActivity {

    private PDFView pdfView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus);

        pdfView1 = findViewById(R.id.pdfview1);

        pdfView1.useBestQuality(true);
        pdfView1.enableSwipe(true);
        pdfView1.fitToWidth();
        pdfView1.fromAsset("CPlusPlus.pdf").load();

    }
}