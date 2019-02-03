package com.ragna.models;

import java.util.Date;

public class Anime {

	public enum Gender{
		
		HORROR("Horror"),
		COMEDY("Comedy"),
		ACTION("Action");
		
		private String name;
		
		Gender(final String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
	}
	
	private String name;
	private Gender gender;
	private Date produced;
	private int punctuation;
	private String web;
	
	public Anime(String name, Gender gender, Date produced, int punctuation, String web) {
		super();
		this.name = name;
		this.gender = gender;
		this.produced = produced;
		this.punctuation = punctuation;
		this.web = web;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Date getProduced() {
		return produced;
	}
	
	public void setProduced(Date produced) {
		this.produced = produced;
	}
	
	public int getPunctuation() {
		return punctuation;
	}
	
	public void setPunctuation(int punctuation) {
		this.punctuation = punctuation;
	}
	
	public String getWeb() {
		return web;
	}
	
	public void setWeb(String web) {
		this.web = web;
	}
	
}
