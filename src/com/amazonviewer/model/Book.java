package com.amazonviewer.model;

import java.util.Date;
//implements, indica que se esta implementando la interface IVisualizable
public class Book extends Publications implements IVisualizable{
	

	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	

	public Book(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public boolean isReaded() {
		return readed;
	}


	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = "\n ::::BOOKS::::" +
			                "\n Title: " + getTitle() +
			                "\n Editorial: " + getEditorial() +
			                "\n Edition Date: " + getEditionDate() +
			                "\n Autor: " ;
		for (int i = 0; i < getAuthors().length; i++) {
			 detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
	}

	
	//Metodos sobreescritos provenientes de la interface, es aqui en donde se establse el comportamiento de los metodos.

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()) {//Validacion para determonar el tiempo de lectura y asignarlo al metodo timeReaded
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeReaded(0);
		}
	}	
	
}
