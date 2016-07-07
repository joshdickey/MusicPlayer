package com.warpgatetechnologies.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mAudioFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAudioFile = MediaPlayer.create(this, R.raw.kalimba);

        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        Button btnPause = (Button) findViewById(R.id.btnPause);

        //set on click listeners
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mAudioFile.start();
               Toast.makeText(MainActivity.this, "you pressed play", Toast.LENGTH_SHORT).show();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAudioFile.pause();
                Toast.makeText(MainActivity.this, "you pressed pause", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
