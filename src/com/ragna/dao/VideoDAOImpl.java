package com.ragna.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ragna.models.Video;

@Repository
public class VideoDAOImpl implements VideoDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addVideo(Video video) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(video);
	}

	@Override
	public Video getVideo(int id) {
		return null;
	}

	@Override
	public List<Video> listVideos() {
		Session session = this.sessionFactory.getCurrentSession();
		
		List<Video> personsList = session.createQuery("from Video").list();
		
		return personsList;
	}

}
