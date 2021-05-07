package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class HTMlActivity extends AppCompatActivity {

    private PDFView pdfView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_t_ml);


        pdfView3 = findViewById(R.id.pdfview3);

        pdfView3.useBestQuality(true);
        pdfView3.enableSwipe(true);
        pdfView3.fitToWidth();
        pdfView3.fromAsset("HTML5.pdf").load();
        

    }
}