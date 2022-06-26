package com.beyzanurokudan.firstcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //describing
    EditText number1Text;
    EditText number2Text;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //app is first opened
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enter id
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        textView1 = findViewById(R.id.textView1);


    }
    //onclick methods
    public void sum(View view) {
        //prevent blanking
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            textView1.setText("Please Enter Number !");
        } else {
            //getting numbers
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            //result
            int result = number1 + number2;
            textView1.setText("Result: " + result);
        }
    }
    public void subtract(View view) {
        //prevent blanking
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            textView1.setText("Please Enter Number !");
        } else {
            //getting numbers
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            //result
            int result = number1 - number2;
            textView1.setText("Result: " + result);

        }
    }
    public void multiplication(View view) {
        //prevent blanking
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            textView1.setText("Please Enter Number !");
        } else {
            //getting numbers
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            //result
            int result = number1 * number2;
            textView1.setText("Result: " + result);

        }
    }
    public void division(View view) {
        //prevent blanking
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            textView1.setText("Please Enter Number !");
        } else {
            //getting numbers
            float number1 = Integer.parseInt(number1Text.getText().toString());
            float number2 = Integer.parseInt(number2Text.getText().toString());

            //result
            float result = number1 / number2; //get decimal number
            textView1.setText("Result: " + result);

        }
    }
}