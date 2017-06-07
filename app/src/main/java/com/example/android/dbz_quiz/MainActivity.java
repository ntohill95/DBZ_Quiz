package com.example.android.dbz_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
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
    private RadioGroup radioGroupQ4;
    private RadioGroup radioGroupQ5;
    private RadioGroup radioGroupQ6;
    private RadioGroup radioGroupQ7;
    private RadioGroup radioGroupQ8;
    private RadioGroup radioGroupQ10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        this.radioGroupQ1 = (RadioGroup) findViewById(R.id.q1group);
        this.radioGroupQ2 = (RadioGroup) findViewById(R.id.q2group);
        this.radioGroupQ4 = (RadioGroup) findViewById(R.id.q4group);
        this.radioGroupQ5 = (RadioGroup) findViewById(R.id.q5group);
        this.radioGroupQ6 = (RadioGroup) findViewById(R.id.q6group);
        this.radioGroupQ7 = (RadioGroup) findViewById(R.id.q7group);
        this.radioGroupQ8 = (RadioGroup) findViewById(R.id.q8group);
        this.radioGroupQ10 = (RadioGroup) findViewById(R.id.q10group);
    }

    public void checkAnswerForGroup(RadioGroup group, String answer) {
        RadioButton radioButton = (RadioButton) findViewById(group.getCheckedRadioButtonId());
        if (radioButton.getText().toString().equalsIgnoreCase(answer)) {
            totalScore += 1;
        }

    }

    public void onCheckboxClicked(View view) {
        CheckBox CB9a = (CheckBox) findViewById(R.id.checkbox_9a);
        CheckBox CB9b = (CheckBox) findViewById(R.id.checkbox_9b);
        CheckBox CB9c = (CheckBox) findViewById(R.id.checkbox_9c);
        CheckBox CB9d = (CheckBox) findViewById(R.id.checkbox_9d);
        Boolean checkState9a = CB9a.isChecked();
        Boolean checkState9b = CB9b.isChecked();
        Boolean checkState9c = CB9c.isChecked();
        Boolean checkState9d = CB9d.isChecked();

        if (checkState9a && checkState9b && checkState9c && !checkState9d) {
            totalScore += 1;
        }
    }

    public void submit(View view) {

        checkAnswerForGroup(this.radioGroupQ1, "Big Gete Star");
        checkAnswerForGroup(this.radioGroupQ2, "Lord Beerus");
        EditText nameView = (EditText) findViewById(R.id.name_view);
        String nameEntered = nameView.getText().toString();
        if (nameEntered.equals("2")) {
            totalScore += 1;
        }
        checkAnswerForGroup(this.radioGroupQ4, "Dr Flappe");
        checkAnswerForGroup(this.radioGroupQ5, "Wish to revive all Namekians who died during the Frieza Saga");
        checkAnswerForGroup(this.radioGroupQ6, "None");
        checkAnswerForGroup(this.radioGroupQ7, "None");
        checkAnswerForGroup(this.radioGroupQ8, "None");
        checkAnswerForGroup(this.radioGroupQ10, "1000 years");

        if(totalScore > 0) {
            Toast.makeText(MainActivity.this, "Your total score is " + (Integer.toString(totalScore) + "/10"), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "You got them all wrong! Try again!", Toast.LENGTH_LONG).show();
        }

        totalScore = 0;

    }
}
