package com.example.testumang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText e1,e2;
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);

        b1 = (Button) findViewById(R.id.btn);
        b1.setOnClickListener(this);

        tv1= (TextView) findViewById(R.id.textView);


    }

    @Override
    public void onClick(View view) {

        Integer a = Integer.parseInt(e1.getText().toString());
        Integer b = Integer.parseInt(e2.getText().toString());

        Integer sum = a + b ;

        tv1.setText(sum.toString());
    }
}