package com.example.youtify;

public class YoutubeVideo {
    String videourl;
    public YoutubeVideo(){
    }
    public YoutubeVideo(String videourl){
        this.videourl = videourl;
    }
    public String getVideourl(){
        return videourl;
    }
    public void setVideourl(String videourl){
        this.videourl = videourl;
    }
}
