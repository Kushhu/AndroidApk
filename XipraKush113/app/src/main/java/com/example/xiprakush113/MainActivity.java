package com.example.xiprakush113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup rdg1,rdg2,rdg3,rdg4,rdg5;
    RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15;
    Button bsubmit,breset,bexit;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdg1 = (RadioGroup) findViewById(R.id.rd1);
        rdg2 = (RadioGroup) findViewById(R.id.rd2);
        rdg3 = (RadioGroup) findViewById(R.id.rd3);
        rdg4 = (RadioGroup) findViewById(R.id.rd4);
        rdg5 = (RadioGroup) findViewById(R.id.rd5);


        r1 = (RadioButton) findViewById(R.id.radioButton11);
        r2 = (RadioButton) findViewById(R.id.radioButton12);
        r3 = (RadioButton) findViewById(R.id.radioButton13);

        r4 = (RadioButton) findViewById(R.id.radioButton21);
        r5 = (RadioButton) findViewById(R.id.radioButton22);
        r6 = (RadioButton) findViewById(R.id.radioButton23);

        r7 = (RadioButton) findViewById(R.id.radioButton31);
        r8 = (RadioButton) findViewById(R.id.radioButton32);
        r9 = (RadioButton) findViewById(R.id.radioButton33);

        r10 = (RadioButton) findViewById(R.id.radioButton41);
        r11 = (RadioButton) findViewById(R.id.radioButton42);
        r12 = (RadioButton) findViewById(R.id.radioButton43);

        r13 = (RadioButton) findViewById(R.id.radioButton51);
        r14 = (RadioButton) findViewById(R.id.radioButton52);
        r15 = (RadioButton) findViewById(R.id.radioButton53);

        bsubmit = (Button) findViewById(R.id.btn1);
        bsubmit.setOnClickListener(this);

        breset = (Button)findViewById(R.id.btn2);
        breset.setOnClickListener(this);

        bexit = (Button) findViewById(R.id.btn3);
        bexit.setOnClickListener(this);

        txt1 = (TextView) findViewById(R.id.textshow);
        txt2 = (TextView) findViewById(R.id.textshow1);
        txt3 = (TextView) findViewById(R.id.textshow2);
        txt4 = (TextView) findViewById(R.id.textshow3);
        txt5 = (TextView) findViewById(R.id.textshow4);
        txt6 = (TextView) findViewById(R.id.textshow5);
        txt7 = (TextView) findViewById(R.id.textshow6);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btn1) {
            int attend1 = 0, unattand = 0;
            int right = 0, wrong = 0;
            int got = 0, cut = 0, total = 0;

            if (r1.isChecked() || r2.isChecked() || r3.isChecked()) {
                attend1++;
                if (rdg1.getCheckedRadioButtonId() == r1.getId()) {
                    right++;
                } else {
                    wrong++;
                }
            } else {
                unattand++;
            }

            if (r4.isChecked() || r5.isChecked() || r6.isChecked()) {
                attend1++;
                if (rdg2.getCheckedRadioButtonId() == r6.getId()) {
                    right++;
                } else {
                    wrong++;
                }
            } else {
                unattand++;
            }

            if (r7.isChecked() || r8.isChecked() || r9.isChecked()) {
                attend1++;
                if (rdg3.getCheckedRadioButtonId() == r8.getId()) {
                    right++;
                } else {
                    wrong++;
                }
            } else {
                unattand++;
            }

            if (r10.isChecked() || r11.isChecked() || r12.isChecked()) {
                attend1++;
                if (rdg4.getCheckedRadioButtonId() == r10.getId()) {
                    right++;
                } else {
                    wrong++;
                }
            } else {
                unattand++;
            }

            if (r13.isChecked() || r14.isChecked() || r15.isChecked()) {
                attend1++;
                if (rdg5.getCheckedRadioButtonId() == r15.getId()) {
                    right++;
                } else {
                    wrong++;
                }
            } else {
                unattand++;
            }

            got = right * 5;
            cut = wrong * (-2);
            total = got + cut;

            txt1.setText(attend1 + "");
            txt2.setText(unattand + "");
            txt3.setText(wrong + "");
            txt4.setText(right + "");
            txt5.setText(got + "");
            txt6.setText(cut + "");
            txt7.setText(total + "");
        }
        if(view.getId() == R.id.btn2)
        {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
        }
    }
}