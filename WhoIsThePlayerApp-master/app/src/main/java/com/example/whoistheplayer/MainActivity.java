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


public class MainActivity extends AppCompatActivity {

    //menu
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

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // loading Animation

        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        final TextView textView= findViewById(R.id.textView);
        textView.setAnimation(animation);


    }


    public void help(View view)
    {
        Intent btnHelp = new Intent(this, help.class);
        startActivity(btnHelp);
    }

    public void play(View view)
    {
        Intent btnPlay = new Intent(this, player1.class);
        startActivity(btnPlay);
    }

}