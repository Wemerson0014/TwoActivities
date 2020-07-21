package com.estudo.twoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acesHighLetterMusic();
    }

    public void acesHighLetterMusic() {

        Button acesHighButton = findViewById(R.id.button_aces_high);
        acesHighButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ACES HIGH", Toast.LENGTH_LONG).show();
            }
        });
    }
}