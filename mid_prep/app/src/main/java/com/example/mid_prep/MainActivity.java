package com.example.mid_prep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     b1=findViewById(R.id.b1);

     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent it = new Intent(MainActivity.this,login.class);
             startActivity(it);
             finish();
         }
     });

    }

//    public void msg(View view) {
//        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
//
//    }


//    public void msg2(View view) {
//        Toast.makeText(this, "Welcome Bro", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(MainActivity.this,login.class);
//        startActivity(it);
//
//    }

//    public void onBackPressed()
//    {
//        finish();
//    }
}
