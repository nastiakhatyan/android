package com.example.a2laba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_resnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_resnum = findViewById(R.id.tv_resnum);
        int first = getIntent().getExtras().getInt("1num");
        int second = getIntent().getExtras().getInt("2num");
        String op = getIntent().getExtras().getString("operation");

        if (op.equals("+")) {
            tv_resnum.setText(String.valueOf(first + second));
        }
        else if (op.equals("-")) {
            tv_resnum.setText(String.valueOf(first - second));
        }
        else if (op.equals("*")) {
            tv_resnum.setText(String.valueOf(first * second));
        }
        else {
            tv_resnum.setText(String.valueOf(first / second));
        }

    }
}