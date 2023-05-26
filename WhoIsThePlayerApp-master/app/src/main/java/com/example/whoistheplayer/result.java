package com.example.whoistheplayer;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class result extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.help:
                Intent help = new Intent(this, help.class);
                startActivity(help);
                return true;
            case R.id.home:
                Intent home = new Intent(this, MainActivity.class);
                startActivity(home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    TextView textView;
    TextView txt;
    int score;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        image = findViewById(R.id.imageView8);

        Animation anim = AnimationUtils.loadAnimation(result.this, R.anim.fadein);
        image.setAnimation(anim);
        anim.start();

        textView = findViewById(R.id.textView_Score);
        txt = findViewById(R.id.textView3);

        score = getIntent().getIntExtra("points", 0);

        textView.setText("You got " + Integer.toString(score) + " out of 5");
        finishQuiz();

    }

    public void startOver(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void finishQuiz() {
        String status = "";
        if (score == 5) {
            status = "Awesome!!";
            txt.setText(status);
        }
        else if (score > 3) {
            status = "Good Job!!";
            txt.setText(status);
        }
        else {
            status = "Try again..";
            txt.setText(status);
        }
    }
}