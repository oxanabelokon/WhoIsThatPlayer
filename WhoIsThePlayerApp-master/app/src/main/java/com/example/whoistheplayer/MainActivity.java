package com.example.whoistheplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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