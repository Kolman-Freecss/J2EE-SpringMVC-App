package com.ragna.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ragna.models.Anime;

@Service
public class AnimeService {

	private static List<Anime> listOfAnimes = new ArrayList<Anime>(); 

	static {
		
		listOfAnimes.add(new Anime("Sword Art Online: Alicization", Anime.Gender.ACTION, new Date(), 8, "https://animeflv.net/anime/5475/sword-art-online-alicization"));
		
	}
	
	public List<Anime> getListAnimes() {
		
		return listOfAnimes;
				
	}
	
	
	
}
