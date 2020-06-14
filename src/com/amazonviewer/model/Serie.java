package com.amazonviewer.model;
//Movie clase que hereda de la clase Film (extends Film)
public class Serie extends Film {
	
	//Atributos propios de Serie
	private int id;
	private int sessionQuantity;
	private Chapter[] chapters;
	
	
	//Metodo constructor que proviene de Film, permite la creacion de objetos de tipo Serie, 
	//requiere los parametros que hereda de la clase Film (Super) 
	//este metodo esta sobreescribiendo el comportamniento original del metodo en Film, al agregar un parametro
	//que no esta en el metodo declarado en Film (Polimorfismo)
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
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



	public Chapter[] getChapters() {
		return chapters;
	}



	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

    

	
	
}
