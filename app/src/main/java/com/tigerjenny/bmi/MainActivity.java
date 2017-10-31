package com.tigerjenny.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        //System.out.println("hahahaha");
        //Log.d("MainActivity","testing bmi method");
        //Log.e("MainActivity","hahaha");
        //Log.i("MainActivity","hihihihi");
        //Log.w("MainActivity","wooooo");
        //Log.v("MainActivity","woof");
        //Log.wtf("MainActivity","hahahaha");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeigh = (EditText) findViewById(R.id.ed_heigh);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float heigh = Float.parseFloat(edHeigh.getText().toString());
        float bmi = weight/(heigh*heigh);
       /* Log.d("MainActivity","Your BMI is :" + bmi );
                   Toast.makeText(this,
                   "Your BMI is " + bmi,
                   Toast.LENGTH_SHORT).show();
                   */
       new AlertDialog.Builder(this)
               .setMessage("Your BMI is" +bmi)
               .setTitle("my title")
               .setPositiveButton("OK", null)
               .show();

    }
}
