package com.example.youtify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {
    List<YoutubeVideo> youtubeVideoList;
    public VideoAdapter(){}
    public VideoAdapter(List<YoutubeVideo>youtubeVideoList){
        this.youtubeVideoList = youtubeVideoList;
    }
    @Override
    public VideoViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view,parent,false);
        return new VideoViewHolder(view);
    }
    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position){
        holder.videoWeb.loadData(youtubeVideoList.get(position).getVideourl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }
    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHolder(View itemview){
            super(itemview);
            videoWeb = (WebView)itemview.findViewById(R.id.videoView);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());
        }
    }
}
