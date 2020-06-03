package com.example.a2laba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_first;
    EditText et_second;
    RadioGroup rg_operation;
    Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_first = findViewById(R.id.et_first);
        et_second = findViewById(R.id.et_second);

        rg_operation = findViewById(R.id.rg_operation);

        btn_calculate = (Button)findViewById(R.id.btn_calculate);
        btn_calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("1num", Integer.parseInt(et_first.getText().toString()));
        intent.putExtra("2num", Integer.parseInt(et_second.getText().toString()));

        int selected_operation = rg_operation.getCheckedRadioButtonId();
        RadioButton rb_operation = findViewById(selected_operation);
        intent.putExtra("operation", rb_operation.getText().toString());

        startActivity(intent);
    }

}