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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class player3 extends AppCompatActivity {
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

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    int score;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player3);

        btn1 = findViewById(R.id.btnPlayer3_1);
        btn2 = findViewById(R.id.btnPlayer3_2);
        btn3 = findViewById(R.id.btnPlayer3_3);
        btn4 = findViewById(R.id.btnPlayer3_4);
        image = findViewById(R.id.imageViewPlayer3);

        Animation anim = AnimationUtils.loadAnimation(player3.this, R.anim.fadein);
        image.setAnimation(anim);
        anim.start();

        score = getIntent().getIntExtra( "points", 0 );
    }

    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.btnPlayer3_2:
            case R.id.btnPlayer3_1:
            case R.id.btnPlayer3_4:

                Intent intent = new Intent(this, player4.class);
                intent.putExtra( "points", score );
                startActivity(intent);
                break;
            case R.id.btnPlayer3_3:
                score++;
                Toast.makeText(this, "Your score is " + score + "/5", Toast.LENGTH_SHORT).show();

                Intent intent1 = new Intent(this, player4.class);
                intent1.putExtra( "points", score );
                startActivity(intent1);
                break;
        }
    }
}