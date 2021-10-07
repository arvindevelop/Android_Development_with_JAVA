package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                {
                    @Override
                    public void onCompletion(MediaPlayer mediaplayer)
                    {
                        Toast.makeText(MainActivity.this,"I'm done",Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });

        Button pauseButton = (Button) findViewById(R.id.pause_button);

        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mediaPlayer.pause();
            }
        });



    }
}