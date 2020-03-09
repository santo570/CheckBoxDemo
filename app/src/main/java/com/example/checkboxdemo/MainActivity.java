package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkCheckBox,sugarCheckBox,waterCheckbox;
    private Button showButton;
    private TextView resultTextView;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkCheckBox =(CheckBox) findViewById(R.id.milkCheckBoxID);
        sugarCheckBox=(CheckBox) findViewById(R.id.sugarCheckBoxID);
        waterCheckbox =(CheckBox) findViewById(R.id.waterCheckBoxID);

       showButton =(Button) findViewById(R.id.showButtonID);
       resultTextView =(Button) findViewById(R.id.resultTextViewID);
       showButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               StringBuilder stringBuilder = new StringBuilder();
               if (milkCheckBox.isChecked()) {
                   String value = milkCheckBox.getText().toString();
                   stringBuilder.append(value + "is ordered");
               }
               if (sugarCheckBox.isChecked()) {
                   String value = sugarCheckBox.getText().toString();
                   stringBuilder.append(value + "is ordered");

               }
               if (waterCheckbox.isChecked()) {
                   String value = waterCheckbox.getText().toString();
                   stringBuilder.append(value + "is ordered");
               }
               resultTextView.setText(stringBuilder);
           }
       });

    }
       }
