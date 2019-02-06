package com.ragna.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragna.dao.VideoDAO;
import com.ragna.models.Video;

@Service
public class VideoServiceImpl implements VideoService{

	@Autowired
	private VideoDAO videoDAO;
	
	@Override
	public void addVideo(Video video) {
		this.videoDAO.addVideo(video);
	}

	@Override
	public Video getVideo(int id) {
		return this.videoDAO.getVideo(id);
	}

	@Override
	public List<Video> listVideos() {
		return this.videoDAO.listVideos();
	}

	
	
}
