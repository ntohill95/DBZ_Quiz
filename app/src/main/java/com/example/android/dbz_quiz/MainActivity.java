package com.example.android.dbz_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {
    int totalScore = 0;
    private RadioGroup radioGroupQ1;
    private RadioGroup radioGroupQ2;
    private RadioGroup radioGroupQ3;
    private RadioGroup radioGroupQ4;
    private RadioGroup radioGroupQ5;
    private RadioGroup radioGroupQ6;
    private RadioGroup radioGroupQ7;
    private RadioGroup radioGroupQ8;
    private RadioGroup radioGroupQ9;
    private RadioGroup radioGroupQ10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        this.radioGroupQ1 = (RadioGroup) findViewById(R.id.q1group);
        this.radioGroupQ2 = (RadioGroup) findViewById(R.id.q2group);
        this.radioGroupQ3 = (RadioGroup) findViewById(R.id.q3group);
        this.radioGroupQ4 = (RadioGroup) findViewById(R.id.q4group);
        this.radioGroupQ5 = (RadioGroup) findViewById(R.id.q5group);
        this.radioGroupQ6 = (RadioGroup) findViewById(R.id.q6group);
        this.radioGroupQ7 = (RadioGroup) findViewById(R.id.q7group);
        this.radioGroupQ8 = (RadioGroup) findViewById(R.id.q8group);
        this.radioGroupQ9 = (RadioGroup) findViewById(R.id.q9group);
        this.radioGroupQ10 = (RadioGroup) findViewById(R.id.q10group);
    }

    public void checkAnswerForGroup(RadioGroup group, String answer) {
        RadioButton radioButton = (RadioButton) findViewById(group.getCheckedRadioButtonId());
        if (radioButton.getText().toString().equalsIgnoreCase(answer)) {
            totalScore += 1;
        }
    }

    public void submit(View view) {

        checkAnswerForGroup(this.radioGroupQ1, "Big Gete Star");
        checkAnswerForGroup(this.radioGroupQ2, "Lord Beerus");
        checkAnswerForGroup(this.radioGroupQ3, "2");
        checkAnswerForGroup(this.radioGroupQ4, "Dr Flappe");
        checkAnswerForGroup(this.radioGroupQ5, "Wish to revive all Namekians who died during the Frieza Saga");
        checkAnswerForGroup(this.radioGroupQ6, "None");
        checkAnswerForGroup(this.radioGroupQ7, "None");
        checkAnswerForGroup(this.radioGroupQ8, "None");
        checkAnswerForGroup(this.radioGroupQ9, "None");
        checkAnswerForGroup(this.radioGroupQ10, "1000 years");

        Toast.makeText(MainActivity.this, "Your total score is " + (Integer.toString(totalScore) + "/10"), Toast.LENGTH_LONG).show();
        totalScore = 0;

    }
}
