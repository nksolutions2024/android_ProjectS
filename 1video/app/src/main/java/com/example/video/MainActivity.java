package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView pppp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pppp=findViewById(R.id.videoView);

        String path = "android.resource://"+getPackageName()+"/raw/mp4_video_stored_in_raw";
        pppp.setVideoPath(path);
        pppp.start();
    }
}