package com.example.whoistheplayer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class player5 extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player5);

        btn1 = findViewById(R.id.btnPlayer5_1);
        btn2 = findViewById(R.id.btnPlayer5_2);
        btn3 = findViewById(R.id.btnPlayer5_3);
        btn4 = findViewById(R.id.btnPlayer5_4);

        score = getIntent().getIntExtra( "points", 0 );
    }

    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.btnPlayer5_2:
            case R.id.btnPlayer5_3:
            case R.id.btnPlayer5_1:
                Intent intent = new Intent(this, wrong.class);
                intent.putExtra( "points", score );
                startActivity(intent);
                break;
            case R.id.btnPlayer5_4:
                score++;
                Toast.makeText(this, "Your score is " + score + "/5", Toast.LENGTH_SHORT).show();

                Intent intent1 = new Intent(this, wrong.class);
                intent1.putExtra( "points", score );
                startActivity(intent1);
                break;

        }
    }
}