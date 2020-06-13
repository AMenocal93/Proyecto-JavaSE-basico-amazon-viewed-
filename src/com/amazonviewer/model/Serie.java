package com.amazonviewer.model;

public class Serie extends Film {
	
	private int id;
	private int sessionQuantity;
	private Chapter[] chapter;
	
	
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	
	
}
