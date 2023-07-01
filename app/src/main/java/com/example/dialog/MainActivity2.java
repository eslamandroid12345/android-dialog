package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    protected TextView firstName,address,age,salary;
    protected Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button3 = (Button) findViewById(R.id.button3);
        firstName = (TextView) findViewById(R.id.textView7);
        address = (TextView) findViewById(R.id.textView8);
        age = (TextView) findViewById(R.id.textView9);
        salary = (TextView) findViewById(R.id.textView10);

        Bundle bundle = getIntent().getExtras();
        String firstNameAdd = bundle.getString("firstName");
        String addressAdd = bundle.getString("address");
        int ageAdd = bundle.getInt("age");
        double salaryAdd = bundle.getDouble("salary");

        firstName.setText("firstName " + firstNameAdd);
        address.setText("address " + addressAdd);
        age.setText("age " + ageAdd);
        salary.setText("salary " + (int) salaryAdd);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}