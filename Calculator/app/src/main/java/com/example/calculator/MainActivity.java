package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //variables
    private int result = 0;
    private int temp = 0;
    private int operate = 0;

    //functions
    private void display(int result) {
        TextView resultView = (TextView) findViewById(R.id.resultView);
        resultView.setText("" + result);
    }

    public void add9(View view) {
        result = result*10 + 9;
        display(result);
    }

    public void add8(View view) {
        result = result*10 + 8;
        display(result);
    }

    public void add7(View view) {
        result = result*10 + 7;
        display(result);
    }

    public void add6(View view) {
        result = result*10 + 6;
        display(result);
    }

    public void add5(View view) {
        result = result*10 + 5;
        display(result);
    }

    public void add4(View view) {
        result = result*10 + 4;
        display(result);
    }

    public void add3(View view) {
        result = result*10 + 3;
        display(result);
    }

    public void add2(View view) {
        result = result*10 + 2;
        display(result);
    }

    public void add1(View view) {
        result = result*10 + 1;
        display(result);
    }

    public void add0(View view) {
        result = result*10 + 0;
        display(result);
    }

    //operations
    private void operation() {
        switch(operate){
            case 0:
                display(result);
                break;
            case 1:
                result = result + temp;
                display(result);
                break;
            case 2:
                result = temp - result;
                display(result);
                break;
            case 3:
                result = result * temp;
                display(result);
                break;
            case 4:
                result = temp / result;
                display(result);
                break;
        }
    }

    public void add(View view) {
        operation();
        temp = result;
        result = 0;
        operate = 1;
    }

    public void minus(View view) {
        operation();
        temp = result;
        result = 0;
        operate = 2;
    }

    public void multiply(View view) {
        operation();
        temp = result;
        result = 0;
        operate = 3;
    }

    public void divide(View view) {
        operation();
        temp = result;
        result = 0;
        operate = 4;
    }

    public void enter(View view) {
        operation();
        temp = 0;
        result = 0;
        operate = 0;
    }

    public void clean(View view) {
        display(0);
        result = 0;
        temp = 0;
        operate = 0;
    }

}
