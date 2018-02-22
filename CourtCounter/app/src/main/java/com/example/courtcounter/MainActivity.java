package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //variables
    private int A = 0;
    private int B = 0;

    //functions of team A
    private void displayA(int tA) {
        TextView temp = (TextView) findViewById(R.id.scoreA);
        temp.setText(""+ tA );
    }

    public void aPlus3(View view) {
        A+=3;
        displayA(A);
    }

    public void aPlus2(View view) {
        A+=2;
        displayA(A);
    }

    public void aFree(View view) {
        A++;
        displayA(A);
    }

    //functions of team A
    private void displayB(int tB) {
        TextView temp = (TextView) findViewById(R.id.scoreB);
        temp.setText(""+ tB );
    }

    public void bPlus3(View view) {
        B+=3;
        displayB(B);
    }

    public void bPlus2(View view) {
        B+=2;
        displayB(B);
    }

    public void bFree(View view) {
        B++;
        displayB(B);
    }

    public void reset(View view) {
        A = 0;
        B = 0;
        displayA(A);
        displayB(B);
    }

}
