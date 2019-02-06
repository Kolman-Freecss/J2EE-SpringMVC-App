package com.ragna.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ragna.models.Video;
import com.ragna.services.VideoService;
import com.ragna.util.MockFactory;


@Controller
@RequestMapping("/videos")
public class VideoController {

	@Autowired
	private VideoService videoService;
	
	@Autowired
	private MockFactory mockFactory;
	
	@RequestMapping("/videoTable")
	public ModelAndView loginView() {

		ModelAndView modelView = new ModelAndView("videoTable");
		modelView.addObject("videos", mockFactory.getListVideos());
		
		return modelView;
	}
	
	@PostMapping("/{id}")
	public Video getVideo(@PathVariable int id) {

		return this.videoService.getVideo(id);
		
	}
	
	@GetMapping("/listAllVideos")
	public List<Video> getAllVideos(){
		return this.videoService.listVideos();
	}

}
