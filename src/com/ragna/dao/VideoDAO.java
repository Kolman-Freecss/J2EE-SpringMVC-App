package com.ragna.dao;

import java.util.List;

import com.ragna.models.Video;

public interface VideoDAO {

	public void addVideo(Video video);
	public Video getVideo(int id);
	public List<Video> listVideos();
	
}
