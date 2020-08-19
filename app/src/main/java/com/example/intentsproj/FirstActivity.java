package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText EditNo1;
    EditText EditNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        EditNo1 = findViewById(R.id.editno1);
        EditNo2 = findViewById(R.id.editno2);
    }
    public void onClickButton(View view){

            //Toast.makeText(this, "Sending Massage..", Toast.LENGTH_SHORT).show();
            //CharSequence message = "Sending Massage...";
            //Context context = getApplicationContext();
            //int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
            //Toast toast = Toast.makeText(context, message, duration);
            //toast.show();

            //toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
            //Creating the LayoutInflater instance
            LayoutInflater li = getLayoutInflater();
            //Getting the View object as defined in the customtoast.xml file
            View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

            //Creating the Toast object
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);
            //setting the view of custom toast layout
            toast.show();

            Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
            intent.putExtra("no_1",EditNo1.getText().toString());
            intent.putExtra("no_2",EditNo2.getText().toString());
            startActivity(intent);
    }
};