package com.example.videoplayer;

import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final VideoView buckysVideoView=(VideoView)findViewById(R.id.buckysVideoView);//Reference to videoview
        //path of the video
      buckysVideoView.setVideoPath("https://www.thenewboston.com/forum/project_files/006_testVideo.mp4");
       //Player controls(play,pause,stop...etc)
        MediaController mediaController=new MediaController(this);//Reference to mediacontroller class
        mediaController.setAnchorView(buckysVideoView); //Set anchor view
        buckysVideoView.setMediaController(mediaController);//Set a video to mediacontroller
        buckysVideoView.start();
    }
}
