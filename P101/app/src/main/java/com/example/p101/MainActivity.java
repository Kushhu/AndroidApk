package com.example.p101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView tv1;
    EditText t1,t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById (R.id.txt1);
        t2 = (EditText) findViewById (R.id.txt2);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);

        tv1 = (TextView) findViewById(R.id.tv1);

    }

    @Override
    public void onClick(View view) {

        Integer a = Integer.parseInt(t1.toString());
        Integer b = Integer.parseInt(t2.toString());
        int c = a + b ;
        tv1.setText(c);
    }
}