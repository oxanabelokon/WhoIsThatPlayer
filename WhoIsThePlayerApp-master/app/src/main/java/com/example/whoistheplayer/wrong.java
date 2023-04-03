package com.example.whoistheplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class wrong extends AppCompatActivity {

    TextView textView;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);

        textView=findViewById(R.id.textView_Score);

         score = getIntent().getIntExtra( "points", 0 );

        //score = intent.getStringExtra( "score");
        textView.setText(Integer.toString(score) + "/5");

    }

    public void startOver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}