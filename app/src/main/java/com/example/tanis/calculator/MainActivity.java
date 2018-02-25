package com.example.tanis.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




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
    private Button zero;
    private Button addition;
    private Button substraction;
    private Button multiplication;
    private Button division;
    private Button  euquals;
    private Button  decimal;
    private Button cancels;
    String prevInput=null;
    String prevInput1=null;




    boolean symbol = false,additionFlag=false,subtractionFlag=false,multiplicationFlag=false,divisionFlag=false;
    Boolean equalFlag=false;
    int firstNumber,secondNumber,result;
    String operation="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mapping the XML with the variables here
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
        zero=findViewById(R.id.Zero);


        //Buttons functionality initialised
            One.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if(prevInput.length()<9) {

                        // for Checking the length of numbers it should not be more than 9
                        if(prevInput.equals("0"))
                        screen.setText("1");
                            // for overwrite the privious input
                    else if(equalFlag) {
                        screen.setText("1");
                        equalFlag=false;
                    }
                    else
                    {screen.setText(prevInput + "1");}
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                }}
            });



            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        if(prevInput.equals("0"))
                            screen.setText("2");
                        else if(equalFlag) {
                            screen.setText("2");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "2");
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }

                }


            });
            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();

                    if (prevInput.length() < 9) {
                        if(prevInput.equals("0"))
                        screen.setText("3");

                    else if(equalFlag) {
                        screen.setText("3");
                        equalFlag=false;
                    }
                    else
                        screen.setText(prevInput + "3");
                }

                else
                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }

                }


            });

            Four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        if (prevInput.equals("0"))
                            screen.setText("4");
                        else if(equalFlag) {
                            screen.setText("4");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "4");
                    } else

                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });

            Five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        if (prevInput.equals("0"))
                            screen.setText("5");
                        else if(equalFlag) {
                            screen.setText("5");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "5");
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });

            Six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {

                        if (prevInput.equals("0"))
                            screen.setText("6");
                        else if(equalFlag) {
                            screen.setText("6");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "6");
                    }else {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });
            Seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        if (prevInput.equals("0"))
                            screen.setText("7");
                        else if(equalFlag) {
                            screen.setText("7");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "7");
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });
            Eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        if (prevInput.equals("0"))
                            screen.setText("8");
                        else if(equalFlag) {
                            screen.setText("8");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "8");
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });
            Nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        if (prevInput.equals("0"))
                            screen.setText("9");
                        else if(equalFlag) {
                            screen.setText("9");
                            equalFlag=false;
                        }
                        else
                            screen.setText(prevInput + "9");
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });
            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    if (prevInput.length() < 9) {
                        screen.setText(prevInput + "0");
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                    }
                }
            });

            decimal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    prevInput = screen.getText().toString();
                    screen.setText(prevInput + ".");
                }
            });


      //All Clear Functionality
            AC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    screen.setText( "0");
                }
            });

        positiveNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevInput = screen.getText().toString();
                if (prevInput.length() < 9) {

                    if (prevInput.charAt(0) == '-')
                        screen.setText(prevInput.substring(1));
                    else
                        screen.setText("-" + prevInput);
                } else

                {
                    Toast.makeText(getApplicationContext(),"length Exceeded the limit",Toast.LENGTH_LONG).show();
                }
            }



        });

        //Function for Square root
            squareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float resultSqrt;

                prevInput = screen.getText().toString();
                resultSqrt =(float) java.lang.Math.sqrt(Integer.valueOf(prevInput));
                screen.setText(Float.toString(resultSqrt));
            }
        });


            //Function for Clear Screen
            cancels.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String data = screen.getText().toString();
                   operation="clear";
//                   calculate(operation);
                    screen.setText(data.substring(0,data.length()-1));

                }
            });

            addition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!symbol)
                    {

                        prevInput = screen.getText().toString();

                        firstNumber = Integer.parseInt(prevInput);
                        screen.setText(prevInput + "+");
                        prevInput1 = screen.getText().toString();
                    }
                    else
                    {
                        result = calculate(operation);
                        screen.setText(result + "+");
                    }
                    symbol = true;
                    operation="addition";


                }
            });
            substraction.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!symbol)
                    {

                        prevInput = screen.getText().toString();

                        firstNumber = Integer.parseInt(prevInput);
                        screen.setText(prevInput + "-");
                        prevInput1 = screen.getText().toString();
                    }
                    else
                    {
                        result = calculate(operation);
                        screen.setText(result + "-");
                    }
                    symbol = true;
                    operation="subtraction";
                }
            });
            multiplication.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!symbol)
                    {

                        prevInput = screen.getText().toString();

                        firstNumber = Integer.parseInt(prevInput);
                        screen.setText(prevInput + "*");
                        prevInput1 = screen.getText().toString();
                    }
                    else
                    {
                        result = calculate(operation);
                        screen.setText(result + "*");
                    }
                    symbol = true;
                    operation="multiplication";
                }
            });
            division.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!symbol)
                    {

                        prevInput = screen.getText().toString();

                        firstNumber = Integer.parseInt(prevInput);
                        screen.setText(prevInput + "/");
                        prevInput1 = screen.getText().toString();
                    }
                    else
                    {
                        result = calculate(operation);
                        screen.setText(result + "/");
                    }
                    symbol = true;
                    operation="division";
                }
            });


            //equals Operation

        euquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    result = calculate(operation);
                    screen.setText(Integer.toString(result));
                    equalFlag=true;
                    symbol = false;
            }
        });
    }

    public int calculate(String operation)
    {
        String prevInput;
        prevInput = screen.getText().toString();
        int result=0;

        switch(operation)
        {
            case "clear":

                screen.setText(prevInput1);
                break;

            case "addition":
            secondNumber = Integer.parseInt(prevInput.substring(prevInput.indexOf("+")+1));
            result = firstNumber + secondNumber;
            break;


            case "subtraction":

            secondNumber = Integer.parseInt(prevInput.substring(prevInput.indexOf("-")+1));
            result = firstNumber - secondNumber;
            break;

            case "multiplication":
                secondNumber = Integer.parseInt(prevInput.substring(prevInput.indexOf("*")+1));
                result = firstNumber * secondNumber;
                break;

            case "division":
                secondNumber = Integer.parseInt(prevInput.substring(prevInput.indexOf("/")+1));
                result = firstNumber / secondNumber;
                break;
        }
            firstNumber=result;
            return result;
    }


}
