package com.example.intilaq.add_acticity;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//private static final int forresult_code=1;
public class StartingActivity extends AppCompatActivity {
    private static final int forresult_code=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button for_result_btn=(Button)findViewById(R.id.forresult_btn);
        for_result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartingActivity.this,forResultActivity.class);
                startActivityForResult(intent,forresult_code);
            }
        });
        Button sendEmail_btn=(Button)findViewById(R.id.startsend_btn);
        sendEmail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartingActivity.this,SendEmailActivity.class);
                startActivity(intent);
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
    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == forresult_code) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {

                Toast.makeText(this, data.getStringExtra("Name"), Toast.LENGTH_LONG).show();
            }
        }
    }
}
