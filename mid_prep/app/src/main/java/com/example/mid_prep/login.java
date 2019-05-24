package com.example.mid_prep;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class login extends AppCompatActivity {

    SharedPreferences sh;
    Switch s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sh = getPreferences(MODE_PRIVATE);
        s1 = findViewById(R.id.ss1);
        s2 = findViewById(R.id.ss2);


        s1.setChecked(sh.getBoolean("ss1",false ));
        s2.setChecked(sh.getBoolean("ss2", false));
    }

    public void saveset(View view) {
        SharedPreferences.Editor edt = sh.edit();
        edt.putBoolean("ss1",s1.isChecked());
        edt.putBoolean("ss2",s2.isChecked());
        Toast.makeText(getApplicationContext(), "Changes Saved", Toast.LENGTH_SHORT).show();

        edt.apply();
        edt.commit();
        finish();
    }
}
