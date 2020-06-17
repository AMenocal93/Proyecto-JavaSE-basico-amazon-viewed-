package com.amazonviewer.model;

import java.util.Date;

//Interface que contiene la deckarcion de los metodos que permiten medir el tiempo de visualizacion o lectura
public interface IVisualizable {

	Date startToSee(Date dateI);
	
	void stopToSee(Date dateI, Date dateF);
}
