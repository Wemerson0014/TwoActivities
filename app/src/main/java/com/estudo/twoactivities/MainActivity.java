package com.estudo.twoactivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String ACES_HIGH_MESSAGE = "acesHighMessage";
    public static final String MAKE_BELIEVE_MESSAGE = "makeBelieveMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acesHighLetterMusic();
        makeBelieveLetterMusic();
    }

    public void acesHighLetterMusic() {
        Button acesHighButton = findViewById(R.id.button_aces_high);
        acesHighButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "ACES HIGH", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                String message = getString(R.string.letter_aces_high);
                intent.putExtra(ACES_HIGH_MESSAGE, message);
                startActivity(intent);
            }
        });
    }

    public void makeBelieveLetterMusic() {
        Button makeBelieve = findViewById(R.id.button_make_believe);
        makeBelieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                String messageMakeBelieve = getString(R.string.letter_make_believe);
                intent.putExtra(MAKE_BELIEVE_MESSAGE, messageMakeBelieve);
                startActivity(intent);
            }
        });
    }
}