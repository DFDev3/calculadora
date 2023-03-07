package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView int1,int2,tvres;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdelete,bx,badd,bsubs,bdivide;
    int escribiendo=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int1=findViewById(R.id.int_1);
        int2=findViewById(R.id.int_2);
        tvres=findViewById(R.id.tv_res);
        b0=findViewById(R.id.btn_0);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        bdelete=findViewById(R.id.btn_del);
        bx=findViewById(R.id.btn_multiply);
        badd=findViewById(R.id.btn_add);
        bsubs=findViewById(R.id.btn_divide);
        bdivide=findViewById(R.id.btn_substract);

        int1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int1.setHint("");
                escribiendo=0;
            }
        });
        int2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int2.setHint("");
                escribiendo=1;
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "1");
                } else {
                    int2.setText(int2.getText() + "1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "2");
                } else {
                    int2.setText(int2.getText() + "2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "3");
                } else {
                    int2.setText(int2.getText() + "3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "4");
                } else {
                    int2.setText(int2.getText() + "4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "5");
                } else {
                    int2.setText(int2.getText() + "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "6");
                } else {
                    int2.setText(int2.getText() + "6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "7");
                } else {
                    int2.setText(int2.getText() + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "8");
                } else {
                    int2.setText(int2.getText() + "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "9");
                } else {
                    int2.setText(int2.getText() + "9");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    int1.setText(int1.getText() + "0");
                } else {
                    int2.setText(int2.getText() + "0");
                }
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2;
                if (int1.getText()==""){
                    num1=0;
                }else{
                    num1=Integer.parseInt(int1.getText().toString());
                }
                if (int2.getText()==""){
                    num2=0;
                }else{
                    num2=Integer.parseInt(int2.getText().toString());
                }

                tvres.setText(String.valueOf(num1+num2));
            }
        });
        bsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2;
                if (int1.getText()==""){
                    num1=0;
                }else{
                    num1=Integer.parseInt(int1.getText().toString());
                }
                if (int2.getText()==""){
                    num2=0;
                }else{
                    num2=Integer.parseInt(int2.getText().toString());
                }

                tvres.setText(String.valueOf(num1-num2));
            }
        });
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2;
                if (int1.getText()==""){
                    num1=0;
                }else{
                    num1=Integer.parseInt(int1.getText().toString());
                }
                if (int2.getText()==""){
                    num2=0;
                }else{
                    num2=Integer.parseInt(int2.getText().toString());
                }

                tvres.setText(String.valueOf(num1*num2));
            }
        });
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2;
                if (int1.getText()==""){
                    num1=0;
                }else{
                    num1=Integer.parseInt(int1.getText().toString());
                }
                if (int2.getText()==""){
                    num2=0;
                }else{
                    num2=Integer.parseInt(int2.getText().toString());
                }

                tvres.setText(String.valueOf(num1/num2));
            }
        });

        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvres.setText("0");
                int1.setText("");
                int1.setHint("Add a number");
                int2.setText("");
                int2.setHint("Add a number");
            }
        });
    }
}