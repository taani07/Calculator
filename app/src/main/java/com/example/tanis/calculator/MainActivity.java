package com.example.tanis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView screen;
    private Button AC;
    private Button positiveNegative;
    private Button squareRoot;
    private Button Seven;
    private  Button Eight;
    private Button Nine;
    private Button Four;
    private Button Five;
    private Button Six;
    private Button One;
    private Button two;
    private Button three;
    private Button addition;
    private Button substraction;
    private Button multiplication;
    private Button division;
    private Button  euquals;
    private Button  decimal;
    private Button cancels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.Screen);
        AC=findViewById(R.id.AllClear);
        positiveNegative=findViewById(R.id.positive_Negative);
        squareRoot=findViewById(R.id.Root);
        Seven=findViewById(R.id.Seven);
        Eight=findViewById(R.id.Eight);
        Nine=findViewById(R.id.Nine);
        Four=findViewById(R.id.four);
        Five=findViewById(R.id.five);
        Six=findViewById(R.id.six);
        One=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        addition=findViewById(R.id.addition);
        substraction=findViewById(R.id.substraction);
        multiplication=findViewById(R.id.Multiple);
        division=findViewById(R.id.divison);
        euquals=findViewById(R.id.Equals);
        decimal=findViewById(R.id.decimal);
        cancels=findViewById(R.id.Cancels);





    }
}
