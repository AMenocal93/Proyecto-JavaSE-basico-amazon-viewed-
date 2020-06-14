package com.amazonviewer.model;

import java.util.Date;

//Movie clase que hereda de la clase Film (extends Film)
public class Movie extends Film implements IVisualizable{
	
	//Atributos propios de Movie
	private int id;
	private int timeViewed;
	
	
	
	//Metodo constructor que proviene de Film, permite la creacion de objetos de tipo Movie, 
	//requiere los parametros que hereda de la clase Film (Super) 

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}




	public void showData() {
		//System.out.println("Title: " + title);
		//System.out.println("Genere: " + genre);
		//System.out.println("Year: " + year);
	}
	


	//Metodos get y set (Encapsulamiento)
	//permiten el acceso y la modificacion del valor de variables private 

	public int getId() {
		return id;
	}



	public int getTimeViewed() {
		return timeViewed;
	}


	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	//Sobreescribiendo al metodo ToString de la clase object 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n ::::MOVIES::::" +
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() + 
				"\n Duration: " + getDuration();
	}




	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}




	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()) {
			setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeViewed(0);
		}
		
	}
}
