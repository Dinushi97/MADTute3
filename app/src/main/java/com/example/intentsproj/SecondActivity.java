package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText EditNo1;
    EditText EditNo2;

    String takeEXTRA1,takeEXTRA2;

    TextView lable;

    int no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditNo1 = findViewById(R.id.editno1);
        EditNo2 = findViewById(R.id.editno2);
        lable = findViewById(R.id.lablesecond);

        Intent myIntent = getIntent();
        takeEXTRA1 = myIntent.getStringExtra("no_1");
        takeEXTRA2 = myIntent.getStringExtra("no_2");

        EditNo1.setText(takeEXTRA1);
        EditNo2.setText(takeEXTRA2);

        no1 = Integer.parseInt(takeEXTRA1);
        no2 = Integer.parseInt(takeEXTRA2);
    }

    public void Add(View view){
        lable.setText(takeEXTRA1 + " + " + takeEXTRA2 + " = " + (no1 + no2));
    }

    public void Substract(View view){
        lable.setText(takeEXTRA1 + " - " + takeEXTRA2 + " = " + (no1 - no2));
    }
    public void Multiply(View view){
        lable.setText(takeEXTRA1 + " * " + takeEXTRA2 + " = " + (no1 * no2));
    }
    public void Divide(View view){
        lable.setText(takeEXTRA1 + " / " + takeEXTRA2 + " = " + (no1 / no2));
    }
}