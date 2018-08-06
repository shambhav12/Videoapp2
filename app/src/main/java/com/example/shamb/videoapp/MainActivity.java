package com.example.shamb.videoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);


        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);


        videoView.setMediaController(mediaController);
        Button play = (Button) findViewById(R.id.play);
        

        videoView.start();

    }
}
