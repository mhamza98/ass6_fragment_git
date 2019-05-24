package com.example.mid_prep;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class demo extends AppCompatActivity {

    Button b1, b2, b3;
    EditText t1, t2, t3;

    private static int SPLASH_TIME_OUT =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent n1 = new Intent(demo.this,login.class);
                startActivity(n1);
            }
        })

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);

        String T1 = t1.getText().toString();
        String T2 = t2.getText().toString();

        if (T1=="abc")
        {
            Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
        }


    }

    public void bh1(View view) {
        Toast.makeText(this, "hello_world", Toast.LENGTH_SHORT).show();
    }
}
