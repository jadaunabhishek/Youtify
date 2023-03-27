package com.example.youtify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Vector;

public class dashboard extends AppCompatActivity
{
    RecyclerView recyclerView;
    Vector<YoutubeVideo>youtubeVideos = new Vector<YoutubeVideo>();
    FloatingActionButton addvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        youtubeVideos.add(new YoutubeVideo());
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KR8Xa82GRRg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WgcWJ4HOVTw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4c7Ob4pDYMQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ghcdGB85kCI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Gr82rgJKkPU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KR8Xa82GRRg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ghcdGB85kCI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4c7Ob4pDYMQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);


        addvideo=(FloatingActionButton)findViewById(R.id.addvideo);
        addvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),addvideo.class));
            }
        });
    }
}