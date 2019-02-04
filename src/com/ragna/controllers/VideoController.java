package com.ragna.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ragna.util.MockFactory;


@Controller
public class VideoController {

	@Autowired
	private MockFactory mockFactory;
	
	@RequestMapping("/videoTable")
	public ModelAndView loginView() {

		ModelAndView modelView = new ModelAndView("videoTable");
		modelView.addObject("videos", mockFactory.getListVideos());
		
		return modelView;
	}

}
