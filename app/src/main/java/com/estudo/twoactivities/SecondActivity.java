package com.estudo.twoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.estudo.twoactivities.MainActivity.LETTER_MUSIC;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra(LETTER_MUSIC)) {
            String message = getIntent().getStringExtra(LETTER_MUSIC);
            setTextViewWithLetterMusic(message);
        } else {
            setTextViewError();
        }
    }

    private void setTextViewWithLetterMusic(String message) {
        TextView letterMusic = findViewById(R.id.text_letter_music);
        letterMusic.setText(message);
    }

    private void setTextViewError() {
        TextView header = findViewById(R.id.text_header);
        TextView letter_music = findViewById(R.id.text_letter_music);
        header.setVisibility(View.INVISIBLE);
        letter_music.setText(R.string.text_error);
    }

}