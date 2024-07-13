package com.example.xipra112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner sp1,sp2,sp3;
    Button btn1,btn2;
    TextView tv1;
    TextView tv8,tv9,tv10,tv11,tv12,tv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.spDay);
        sp2 = (Spinner) findViewById(R.id.spMonth);
        sp3 = (Spinner) findViewById(R.id.spYear);

        btn1 = (Button) findViewById(R.id.btnClick);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btnReset);
        btn2.setOnClickListener(this);

        tv1 = (TextView) findViewById(R.id.textView);

        tv8 = (TextView) findViewById(R.id.textView8);
        tv9 = (TextView) findViewById(R.id.textView9);
        tv10 = (TextView) findViewById(R.id.textView10);
        tv11 = (TextView) findViewById(R.id.textView11);
        tv12 = (TextView) findViewById(R.id.textView12);
        tv13 = (TextView) findViewById(R.id.textView13);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btnClick) {
            String fs = sp1.getSelectedItem() + "/" + sp2.getSelectedItem() + "/" + sp3.getSelectedItem();
            tv1.setText(fs.toString());

            String y = "2020";
            Integer age = 0;
            age = (Integer.parseInt(y.toString()) - Integer.parseInt(sp3.getSelectedItem().toString()));
            tv8.setText(Integer.toString(age));

            String m = "7";
            Integer mon = 0;
            mon = (Integer.parseInt(m.toString()) - Integer.parseInt(sp2.getSelectedItem().toString()));
            tv9.setText(Integer.toString(mon));

            String d = "31";
            Integer day = 0;
            day = (Integer.parseInt(d.toString()) - Integer.parseInt(sp1.getSelectedItem().toString()));
            tv10.setText(Integer.toString(day));

            Integer h ;
            Integer hou = 0;
            hou = (age * 365 * 24);
            tv11.setText(Integer.toString(hou));

            int min = 0;
            min = (  age * 365 *24 * 60);
            tv12.setText(Integer.toString(min));

            Integer sec = 0;
            sec = (age * 365 * 24 * 60 * 60);
            tv13.setText(Integer.toString(sec));
        }
        if(view.getId()==R.id.btnReset){
            tv1.setText("");
            tv8.setText("");
            tv9.setText("");
            tv10.setText("");
            tv11.setText("");
            tv12.setText("");
            tv13.setText("");
        }
    }
}