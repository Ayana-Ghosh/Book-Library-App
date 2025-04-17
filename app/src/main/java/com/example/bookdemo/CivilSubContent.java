package com.example.bookdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CivilSubContent extends AppCompatActivity {

    Button civil_back_btn;
    CardView civil_sm,civil_dinSS,civil_dinRS,civil_survey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_sub_content);

        civil_back_btn=findViewById(R.id.civil_back_btn);
        civil_sm=findViewById(R.id.civil_sm);
        civil_dinSS=findViewById(R.id.civil_dinSS);
        civil_dinRS=findViewById(R.id.civil_dinRS);
        civil_survey=findViewById(R.id.civil_survey);

        civil_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CivilSubContent.this,SubjectList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}