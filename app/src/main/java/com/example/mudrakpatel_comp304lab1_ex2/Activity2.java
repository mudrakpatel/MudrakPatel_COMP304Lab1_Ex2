package com.example.mudrakpatel_comp304lab1_ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //Initialize the textviews and display data
        TextView fullNameTextView = (TextView) findViewById(R.id.fullNameTextView);
        TextView programNameTextView = (TextView) findViewById(R.id.programNameTextView);
        TextView semesterTextView = (TextView) findViewById(R.id.semesterTextView);
        TextView courseNameTextView = (TextView) findViewById(R.id.courseNameTextView);

        //Get the intent data and set the text in textviews
        Intent intent = getIntent();
        fullNameTextView.setText(intent.getStringExtra("fullname").toString());
        programNameTextView.setText(intent.getStringExtra("programName").toString());
        semesterTextView.setText(intent.getStringExtra("semester").toString());
        courseNameTextView.setText(intent.getStringExtra("course").toString());

    }
}
