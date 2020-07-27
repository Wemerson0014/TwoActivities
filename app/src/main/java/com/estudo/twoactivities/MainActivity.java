package com.estudo.twoactivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String LETTER_MUSIC = "letterMusic";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOnClickListenerAcesHighButton();
        setOnClickListenerMakeBelieveButton();
        setOnClickListenerStairToHeavenButton();
    }

    public void setOnClickListenerAcesHighButton() {
        Button acesHighButton = findViewById(R.id.button_aces_high);
        acesHighButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = getString(R.string.letter_aces_high);
                startSecondActivityWithExtra(v.getContext(), message);
            }
        });
    }

    public void setOnClickListenerMakeBelieveButton() {
        Button makeBelieve = findViewById(R.id.button_make_believe);
        makeBelieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = getString(R.string.letter_make_believe);
                startSecondActivityWithExtra(v.getContext(), message);
            }
        });
    }

    private void setOnClickListenerStairToHeavenButton() {
        Button stairwayToHeaven = findViewById(R.id.button_stairway_to_heaven);
        stairwayToHeaven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = getString(R.string.letter_stairway_to_heaven);
                startSecondActivityWithExtra(v.getContext(), message);
            }
        });
    }

    private void startSecondActivityWithExtra(Context context, String value) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(MainActivity.LETTER_MUSIC, value);
        startActivity(intent);
    }
}