package com.amazonviewer.model;

import java.util.ArrayList;

//Movie clase que hereda de la clase Film (extends Film)
public class Serie extends Film {
	
	//Atributos propios de Serie
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;
	
	
	//Metodo constructor que proviene de Film, permite la creacion de objetos de tipo Serie, 
	//requiere los parametros que hereda de la clase Film (Super) 
	//este metodo esta sobreescribiendo el comportamniento original del metodo en Film, al agregar un parametro
	//que no esta en el metodo declarado en Film (Polimorfismo)
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
	
		// TODO Auto-generated constructor stub
	}


	
	public int getId() {
		return id;
	}



	public int getSessionQuantity() {
		return sessionQuantity;
	}



	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}



	public ArrayList<Chapter> getChapters() {
		return chapters;
	}



	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

    
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n ::::SERIES::::" +
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration() +
				"\n Temporada: " + getSessionQuantity();
	}

	public static ArrayList<Serie> makeSeriesList(){
		ArrayList<Serie> serie = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			serie.add(new Serie("Serie " + i, "genero " + i, "creador " + i,1200,5,Chapter.makeChapteList()));
		}
		
		return serie;
	}
	
	
}
