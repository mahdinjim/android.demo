package com.example.intilaq.add_acticity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class SeetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences preference =this.getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor editor =preference.edit();
        CheckBox sound_check=(CheckBox)findViewById(R.id.sound_check);
        sound_check.setChecked(preference.getBoolean("sound",false));
        CheckBox vibration_check=(CheckBox)findViewById(R.id.vib_check);
        vibration_check.setChecked(preference.getBoolean("vibration", false));
        String colorchoice=preference.getString("color","black");
        EditText color_txt=(EditText)findViewById(R.id.color_txt);
        color_txt.setText(colorchoice);
        Button save_btn=(Button)findViewById(R.id.save_btn);
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox sound_check=(CheckBox)findViewById(R.id.sound_check);
                CheckBox vibration_check=(CheckBox)findViewById(R.id.vib_check);
                EditText color_txt=(EditText)findViewById(R.id.color_txt);
                editor.putBoolean("sound",sound_check.isChecked());
                editor.putBoolean("vibration",vibration_check.isChecked());
                editor.putString("color",color_txt.getText().toString());
                editor.commit();

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
