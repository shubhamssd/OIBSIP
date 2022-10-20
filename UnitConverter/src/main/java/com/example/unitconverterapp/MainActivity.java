package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3,b4,b5,b6;
        EditText e1,e2;

        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Integer.parseInt(e1.getText().toString());
                    double c = a/100;
                    e2.setText(String.valueOf(c));
                }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Integer.parseInt(e1.getText().toString());
                    double c = a*1000;
                    e2.setText(String.valueOf(c));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Integer.parseInt(e1.getText().toString());
                    double c = a/1000;
                    e2.setText(String.valueOf(c));
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Integer.parseInt(e1.getText().toString());
                    double c = a*1000;
                    e2.setText(String.valueOf(c));
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Integer.parseInt(e1.getText().toString());
                    double c = (a*(2.54));
                    e2.setText(String.valueOf(c));
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Integer.parseInt(e1.getText().toString());
                    double c = a*1000;
                    e2.setText(String.valueOf(c));
                }
            }
        });


    }


}