package com.example.intilaq.add_acticity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button start_btn=(Button)findViewById(R.id.start_btn);
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity.this, StartingActivity.class);
                startActivity(intent);
            }
        });
        Button ui_btn=(Button)findViewById(R.id.openui_btn);
        ui_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,ManipulationUIActivity.class);
                startActivity(intent);
            }
        });
        Button setting_btn=(Button)findViewById(R.id.openseeting_btn);
        setting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,SeetingActivity.class);
                startActivity(intent);
            }
        });
        Button profile_btn=(Button)findViewById(R.id.openprofile_btn);
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,ProfilActivity.class);
                startActivity(intent);
            }
        });

        Button cameras_btn=(Button)findViewById(R.id.opencamera_btn);
        cameras_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });
        Button gps_button=(Button)findViewById(R.id.opengps_btn);
        gps_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,GPSActivity.class);
                startActivity(intent);
            }
        });
        Button bth_button=(Button)findViewById(R.id.openbth_btn);
        bth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,BleutoothActivity.class);
                startActivity(intent);
            }
        });
        Button sns_button=(Button)findViewById(R.id.opensnsh_btn);
        sns_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,SensorActivity.class);
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

}
