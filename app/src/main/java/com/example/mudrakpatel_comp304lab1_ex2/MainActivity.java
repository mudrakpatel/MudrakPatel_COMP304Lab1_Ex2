package com.example.mudrakpatel_comp304lab1_ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = null;

        //Initialize the sendButton and attach a click/tap event handler
        sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //Initialize all the TextViews and the sendButton
                TextView fullNameTextView = (TextView) findViewById(R.id.fullNameTextView);
                TextView programNameTextView = (TextView) findViewById(R.id.programNameTextView);
                TextView semesterTextView = (TextView) findViewById(R.id.semesterTextView);
                TextView courseNameTextView = (TextView) findViewById(R.id.courseNameTextView);

                //Send data through intent object
                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                intent.putExtra("fullname", fullNameTextView.getText().toString());
                intent.putExtra("programName", programNameTextView.getText().toString());
                intent.putExtra("semester", semesterTextView.getText().toString());
                intent.putExtra("course", courseNameTextView.getText().toString());
                startActivity(intent);
            }
        });
    }
}
