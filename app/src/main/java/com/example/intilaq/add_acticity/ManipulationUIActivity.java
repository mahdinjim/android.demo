package com.example.intilaq.add_acticity;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

public class ManipulationUIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulation_ui);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button calcul_btn=(Button)findViewById(R.id.res_btn);
        calcul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText a_val = (EditText) findViewById(R.id.a_txt);
                int a = Integer.parseInt(a_val.getText().toString());
                EditText b_val = (EditText) findViewById(R.id.b_txt);
                int b = Integer.parseInt(b_val.getText().toString());
                EditText result = (EditText) findViewById(R.id.res_txt);
                RadioButton add = (RadioButton) findViewById(R.id.add_rdn);
                RadioButton sub = (RadioButton) findViewById(R.id.sub_rdn);
                RadioButton mul = (RadioButton) findViewById(R.id.mul_rdn);
                RadioButton div = (RadioButton) findViewById(R.id.div_rdn);
                if (add.isChecked()) {
                    int res = a + b;
                    result.setText("result: "+res);

                }
                if (sub.isChecked()) {
                    int res = a - b;
                    result.setText(res);

                }
                if (mul.isChecked()) {
                    int res = a * b;
                    result.setText(res);

                }
                if (div.isChecked()) {
                    if (b != 0) {
                        int res = a / b;
                        result.setText(res);
                    } else {
                        Toast.makeText(ManipulationUIActivity.this, "Can't devide by 0", Toast.LENGTH_LONG);
                    }

                }
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
