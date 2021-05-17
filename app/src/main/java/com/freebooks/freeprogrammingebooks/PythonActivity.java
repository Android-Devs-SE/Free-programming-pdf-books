package com.freebooks.freeprogrammingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PythonActivity extends AppCompatActivity {

    PDFView pdfView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        pdfView8 = findViewById(R.id.pdf8);

        pdfView8.useBestQuality(true);
        pdfView8.enableSwipe(true);
        pdfView8.fitToWidth();
        pdfView8.fromAsset("Python.pdf").load();

    }
}