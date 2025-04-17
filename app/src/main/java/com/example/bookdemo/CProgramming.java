package com.example.bookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class CProgramming extends AppCompatActivity {
    PDFView cse_cProgramming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogramming);
        cse_cProgramming=findViewById(R.id.cse_cProgramming);
        cse_cProgramming.fromAsset("programming-in-C.pdf")
                .defaultPage(0)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10)
                .load();
    }
}