package com.ragna.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ragna.services.AnimeService;

@Controller
public class AnimeController {

	@Autowired
	private AnimeService animeService;
	
	@RequestMapping("/animeTable")
	public ModelAndView loginView() {

		ModelAndView modelView = new ModelAndView("animeTable");
		modelView.addObject("animes", animeService.getListAnimes());
		
		return modelView;
	}

}
