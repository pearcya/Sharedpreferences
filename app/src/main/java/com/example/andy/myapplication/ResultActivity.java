package com.example.andy.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultDisplay = (TextView) findViewById(R.id.resultText);

        SharedPreferences resultPref = getSharedPreferences("MySavedData", Context.MODE_PRIVATE);

        String MyStringValue = resultPref.getString("myValue", "Data not Found");
        resultDisplay.setText(MyStringValue);
    }

}
