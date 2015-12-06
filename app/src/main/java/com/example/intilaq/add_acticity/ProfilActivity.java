package com.example.intilaq.add_acticity;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FileInputStream stream=null;
        Boolean found=false;
        String ret="";
        try {
            InputStream inputStream = openFileInput("profile.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
                String[] data=ret.split("\\|");
                EditText name=(EditText)findViewById(R.id.name_txt);
                EditText surname=(EditText)findViewById(R.id.surname_txt);
                EditText prof=(EditText)findViewById(R.id.profession_txt);
                name.setText(data[0]);
                surname.setText(data[1]);
                prof.setText(data[2]);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            found=false;
        }
        catch (IOException e)
        {
            found=false;
        }
        Button save_btn=(Button)findViewById(R.id.saveinf_btn);
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText name=(EditText)findViewById(R.id.name_txt);
                    EditText surname=(EditText)findViewById(R.id.surname_txt);
                    EditText prof=(EditText)findViewById(R.id.profession_txt);
                    String data=name.getText().toString()+"|"+surname.getText().toString()+"|"+prof.getText().toString();
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("profile.txt", Context.MODE_PRIVATE));
                    outputStreamWriter.write(data);
                    outputStreamWriter.close();
                }
                catch (IOException e) {
                    Toast.makeText(getApplicationContext(),"Can't save data",Toast.LENGTH_LONG);
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
