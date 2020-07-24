package com.estudo.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String ACES_HIGH_MESSAGE = "acesHighMessage";
    public static final String MAKE_BELIEVE_MESSAGE = "makeBelieveMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra(ACES_HIGH_MESSAGE)) {
            getAcesHighLetterMusic();
        } else {
            getMakeBelieveLetterMusic();
        }
    }

    public void getAcesHighLetterMusic() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.ACES_HIGH_MESSAGE);
        TextView textView = findViewById(R.id.text_letter_music);
        textView.setText(message);
    }

    public void getMakeBelieveLetterMusic() {
        Intent intentMakeBelieve = getIntent();
        String message = intentMakeBelieve.getStringExtra(MainActivity.MAKE_BELIEVE_MESSAGE);
        TextView textView = findViewById(R.id.text_letter_music);
        textView.setText(message);
    }

}