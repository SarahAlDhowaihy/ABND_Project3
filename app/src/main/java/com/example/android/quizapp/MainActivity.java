package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitTheQuiz(View view) {
        int score = 0;
        // Cheek Answer one ;
        EditText editText = (EditText) findViewById(R.id.Answer1);
        String q1a1 = editText.getText().toString();
        if (q1a1.equals("Hyper Text Markup Language"))
            score++;
        // End Answer one;
        if (((RadioButton) findViewById(R.id.q2a2)).isChecked()) score++;
        if (((RadioButton) findViewById(R.id.q3a3)).isChecked()) score++;
        if (((RadioButton) findViewById(R.id.q4a1)).isChecked()) score++;
        if (((CheckBox) findViewById(R.id.q5a1)).isChecked()) score++;
        if (!(((CheckBox) findViewById(R.id.q5a2)).isChecked())) score++;
        if (((CheckBox) findViewById(R.id.q5a3)).isChecked()) score++;
        if (((CheckBox) findViewById(R.id.q5a4)).isChecked()) score++;
        if (((CheckBox) findViewById(R.id.q5a5)).isChecked()) score++;
        displayResult(score);
    }

    public void displayResult(int score){
        String message ="The Score ="+score+ " out of 8";
        if (score == 8)
            message+="\nWell Done =)\nYou Do it!";
        else if(score >=5)
            message+="\nIt's good =)\nYou need more practise";
        else if(score>=1)
            message+="\nIt's good =)\nYou need more practise";
        else
            message+="\nI'm sorry for that =(\nYou need more practise";
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    public void onRadioButtonClickedQ2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2a1:
                if (checked)
                    Toast.makeText(this, "The Answer 2 is wrong!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q2a2:
                if (checked)
                    Toast.makeText(this, "The Answer 2 is Correct!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q2a3:
                if (checked)
                    Toast.makeText(this, "The Answer 2 is wrong!", Toast.LENGTH_SHORT).show();

                break;
        }
    }

    public void onRadioButtonClickedQ3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3a1:
                if (checked)
                    Toast.makeText(this, "The Answer 3 is wrong!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q3a2:
                if (checked)
                    Toast.makeText(this, "The Answer 3 is wrong!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q3a3:
                if (checked)
                    Toast.makeText(this, "The Answer 3 is Correct!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onRadioButtonClickedQ4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4a1:
                if (checked)
                    Toast.makeText(this, "The Answer 4 is Correct!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q4a2:
                if (checked)
                    Toast.makeText(this, "The Answer 4 is wrong!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}//end class