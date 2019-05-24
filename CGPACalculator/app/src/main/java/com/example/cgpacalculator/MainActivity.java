package com.example.cgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] text0 = { "Grade", "A", "A-",
            "B+", "B", "B-", "C+","C","C-","D+","D","F" };
    String[] text1 = {"Credit Hour","4","3","2","1"};
    float[] val1 = { 0, 4, (float) 3.69,(float) 3.33,(float) 3,(float) 2.69,(float) 2.33,(float) 2,(float) 1.69,(float) 1.33,1,0};
    int[] val2 = {0, 4, 3, 2, 1};
    Spinner spinner1, spinner2, spinner3, spinner4, testspinner;
    TextView textView1, textView2, testview0,textView3,textView4,testview1,testtest,gpaview;
    Button gpa;
    String[] presidents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //previous code
//    presidents = getResources().getStringArray(R.array.grade_array);
//    Spinner s1 = (Spinner) findViewById(R.id.row12);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, presidents);
//        s1.setAdapter(adapter);
//        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//                int index = arg0.getSelectedItemPosition();
//                Toast.makeText(getBaseContext(),"You Selected" + presidents[index],Toast.LENGTH_SHORT).show();
//
//            }
//
//
//            @Override
//            public void onNothingSelected(AdapterView<?> arg0) {
//
//            }
//        });
            //gpa button
        gpa = findViewById(R.id.bt_sgpa);
        gpaview = findViewById(R.id.sumgpa);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float f1=12;
                float f2=13;
                float sum = f1 + f2;
                gpaview.setText(String.valueOf(sum));
            }
        });
        //new code
        //row1 spinner1 setters
        textView1 = (TextView)findViewById(R.id.row13);
        spinner1 = (Spinner)findViewById(R.id.row12);
        //test spinner
        testtest = (TextView)findViewById(R.id.row33);
        testspinner=(Spinner)findViewById(R.id.row32);
        ArrayAdapter<String> adapter1 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, text0);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(onItemSelectedListener0);
        testspinner.setAdapter(adapter1);
        testspinner.setOnItemSelectedListener(onItemSelectedListener0);
        //row1 spinner2 setters
        textView2 = (TextView)findViewById(R.id.row15);
        spinner2 = (Spinner)findViewById(R.id.row14);
        testview0 = (TextView)findViewById(R.id.row13);
        ArrayAdapter<String> adapter2 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, text1 );
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(onItemSelectedListener1);


        //row2 spinner4
        textView4=(TextView)findViewById(R.id.row25);
        spinner4 = (Spinner)findViewById(R.id.row24);
        testview1 = (TextView)findViewById(R.id.row23);
        ArrayAdapter<String> adapter4 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, text1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(onItemSelectedListener3);

        //row2 spinner1 setters

        textView3=(TextView)findViewById(R.id.row23);
        spinner3 = (Spinner)findViewById(R.id.row22);

        ArrayAdapter<String> adapter3 =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item, text0);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(onItemSelectedListener2);
    }

    //row1 adapter 1, listner 0
    AdapterView.OnItemSelectedListener onItemSelectedListener0 =
                new AdapterView.OnItemSelectedListener(){

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int position, long id) {
                        //spinner1.getSelectedItemPosition();
                        if (spinner1.equals("row12")) {
                            String s1 = String.valueOf(val1[position]);
                            textView1.setText(s1);
                            Toast.makeText(getBaseContext(),"1st" + position,Toast.LENGTH_SHORT).show();
                        }
                        {
                            if (spinner1.equals("row32"))
                            {
                                String s1 = String.valueOf(val1[position]);
                                testtest.setText(s1);
                                Toast.makeText(getBaseContext(),"2nd" + position,Toast.LENGTH_SHORT).show();

                            }
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {}

                };
    //row1 Adapter 2
    AdapterView.OnItemSelectedListener onItemSelectedListener1 =
            new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                String s2 = String.valueOf(val2[position]);
                float s222 = Float.parseFloat(s2);
                String s3 = testview0.getText().toString();
                float s31 = Float.parseFloat(s3);
                float res = s222 * s31;
//                    //resu.setText(String.valueOf(res));
                textView2.setText(String.valueOf(res));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        };


    //row2 adapter1, listner2
    AdapterView.OnItemSelectedListener onItemSelectedListener2 =
            new AdapterView.OnItemSelectedListener(){


                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    String s3 = String.valueOf(val1[position]);
                    textView3.setText(s3);                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}

            };
    //row2 adapter2, listner 3
    AdapterView.OnItemSelectedListener onItemSelectedListener3 =
            new AdapterView.OnItemSelectedListener(){


                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    String s4 = String.valueOf(val2[position]);
                    float s22 = Float.parseFloat(s4);
                    String s34 = testview1.getText().toString();
                    float s333 = Float.parseFloat(s34);
                    float res = s22 * s333;
                    //resu.setText(String.valueOf(res));
                    textView4.setText(String.valueOf(res));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}

            };
}
