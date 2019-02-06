package com.ragna.services;

import java.util.List;

import com.ragna.models.Video;

public interface VideoService {

	public void addVideo(Video video);
	public Video getVideo(int id);
	public List<Video> listVideos();
	
}
