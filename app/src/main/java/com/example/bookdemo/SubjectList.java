package com.example.bookdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubjectList extends AppCompatActivity {

    Button back_btn;
    CardView cse,civil,story,electrical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //back_btn=findViewById(back_btn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);
        back_btn=findViewById(R.id.back_btn);
        cse=findViewById(R.id.cse);
        civil=findViewById(R.id.civil);
        story=findViewById(R.id.story);
        electrical=findViewById(R.id.electrical);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SubjectList.this,MainActivity.class);
                startActivity(intent);
            }
        });

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(SubjectList.this, CseSubContent.class);
                startActivity(intent1);
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(SubjectList.this, CivilSubContent.class);
                startActivity(intent2);
            }
        });

        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(SubjectList.this,ElectricalSubContent.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}