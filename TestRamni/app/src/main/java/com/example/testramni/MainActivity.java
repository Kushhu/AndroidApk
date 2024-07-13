package com.example.testramni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText t1,t2;
    TextView tv1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.et1) ;
        t2 = (EditText) findViewById(R.id.et2);
        b1=(Button)findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        tv1= (TextView)findViewById(R.id.lbl);
    }

    @Override
    public void onClick(View view) {
        Integer a = Integer.parseInt( t1.getText().toString() );
        Integer b = Integer.parseInt( t2.getText().toString() );
        Integer sum = a * b ;
        tv1.setText(sum.toString());
    }
}