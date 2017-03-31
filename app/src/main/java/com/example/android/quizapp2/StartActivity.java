package com.example.android.quizapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    public static final String USER_NAME = "your_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void Start(View view) {
        Intent startNewActivity = new Intent(this, QuizActivity.class);

        EditText name = (EditText) findViewById(R.id.user_name);
        String userName = name.getText().toString();

        if (userName.isEmpty()) {
            Toast.makeText(this, "Please enter your name",
                    Toast.LENGTH_SHORT).show();
            return;
        } else {
            Toast.makeText(getApplicationContext(), "Hello, " + userName + "!",
                    Toast.LENGTH_SHORT).show();
        }

        startNewActivity.putExtra("your_name", userName);

        startActivity(startNewActivity);
    }
}
