package com.ragna.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ragna.models.Video;

@Component
public class MockFactory {

private static List<Video> listOfVideos = new ArrayList<Video>(); 
	
	//Sustitute of BBDD
	static {
		
		listOfVideos.add(new Video("Sword Art Online: Alicization", Video.Gender.ACTION, new Date(), false, false, 8, "https://animeflv.net/anime/5475/sword-art-online-alicization"));
		
	}
	
	public List<Video> getListVideos() {
		
		return listOfVideos;
				
	}
	
}
