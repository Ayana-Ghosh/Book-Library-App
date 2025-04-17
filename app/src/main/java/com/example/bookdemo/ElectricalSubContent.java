package com.example.bookdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElectricalSubContent extends AppCompatActivity {
    Button ee_back_btn;

    CardView ee_signal,ee_mpu,ee_robotics,ee_power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_sub_content);
        ee_back_btn=findViewById(R.id.EE_back_btn);

        ee_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ElectricalSubContent.this,SubjectList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}