package com.test.asus.myapplication;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoview = (VideoView) findViewById(R.id.videoView);

        String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/1.mp4";
         /**
         * 本地视频播放
         */
        videoview.setVideoPath(path);
        /**
         * 网络视频播放
         */
        //videoview.setVideoURI(Uri.parse(""));
        /**
         * MediaController控制视频播放
         */
        MediaController controller = new MediaController(this);
        /**
         * 设置VideoView与MediaController建立关联
         */
        videoview.setMediaController(controller);
        /**
         * 设置MediaControl与VideoView建立关联
         */
        controller.setMediaPlayer(videoview);
    }
}
