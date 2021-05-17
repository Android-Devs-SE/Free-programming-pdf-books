package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PHPActivity extends AppCompatActivity {

    private PDFView pdfView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_h_p);

        pdfView7 = findViewById(R.id.pdf7);

        pdfView7.useBestQuality(true);
        pdfView7.enableSwipe(true);
        pdfView7.fitToWidth();
        pdfView7.fromAsset("PHP.pdf").load();

    }
}