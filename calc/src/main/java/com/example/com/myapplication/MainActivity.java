package com.example.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText edit1, edit2;
    Button btnAdd1, btnAdd2, btnAdd3, btnAdd4, btnAdd5;
    TextView textResult;
    String num1, num2;
    Double result;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calc SeokHyeon");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd1 = (Button) findViewById(R.id.BtnAdd1);
        btnAdd2 = (Button) findViewById(R.id.BtnAdd2);
        btnAdd3 = (Button) findViewById(R.id.BtnAdd3);
        btnAdd4 = (Button) findViewById(R.id.BtnAdd4);
        btnAdd5 = (Button) findViewById(R.id.BtnAdd5);

        textResult = (TextView) findViewById(R.id.TextResult);



            btnAdd1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1.isEmpty() || num2.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please Input the number!", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        result = Double.parseDouble(num1) + Double.parseDouble(num2);
                        textResult.setText("Result : " + result.toString());
                    }
                }
            });

            btnAdd2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(num1.isEmpty() || num2.isEmpty()) {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        Toast.makeText(getApplicationContext(), "Please Input the number!", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        result = Double.parseDouble(num1) - Double.parseDouble(num2);
                        textResult.setText("Result : " + result.toString());
                    }
                }
            });

            btnAdd3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(num1.isEmpty() || num2.isEmpty()) {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        Toast.makeText(getApplicationContext(), "Please Input the number!", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        result = Double.parseDouble(num1) * Double.parseDouble(num2);
                        textResult.setText("Result : " + result.toString());
                    }
                }
            });

            btnAdd4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(num1.isEmpty() || num2.isEmpty()) {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        Toast.makeText(getApplicationContext(), "Please Input the number!", Toast.LENGTH_SHORT).show();
                    }
                    else {

                    if (Double.parseDouble(num2) == 0) {
                        Toast.makeText(getApplicationContext(), "0 cannot calc", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        textResult.setText("Result : " + result.toString());
                    }
                    }
                }
            });

            btnAdd5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(num1.isEmpty() || num2.isEmpty()) {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();

                        Toast.makeText(getApplicationContext(), "Please Input the number!", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        textResult.setText("Result : " + result.toString());
                    }
                }
            });


    }
}