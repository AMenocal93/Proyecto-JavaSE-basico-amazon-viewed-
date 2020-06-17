package com.AmazonViewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.amazonviewer.model.Movie;
import com.amazonviewer.model.Serie;
import com.amazonviewer.model.Chapter;
import com.amazonviewer.model.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	showMenu();
		
		
		
	}
	
	
public static void showMenu() {
	int exit = 0;
	do {
		
		System.out.println("BIENVENIDOS A AMAZON VIEWER");
		System.out.println("");
		System.out.println("Seleccione el numero de la opcion deseada.");
		System.out.println("1. Movies");
		System.out.println("2. Series");
		System.out.println("3. Books");
		System.out.println("4. Magazines");
		System.out.println("5. Report");
		System.out.println("6. Report Today");
		System.out.println("0. Exit");
		
		//Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		int response = Integer.valueOf(sc.nextLine());
		switch (response) {
		case 0:
			//Salir
			
			break;
		case 1:
			showMuvies();
			break;
		case 2:
			showSeries();
			break;
		case 3:
			showBooks();
			break;
		case 4:
			showMagazines();
			break;
		case 5:
			makeReport();
			break;
		case 6:
			//Date date = new Date();
			makeReport(new Date());
			break;

		default:
			System.out.println();
			System.out.println(".... Selecciona una opcion ...");
			System.out.println();
			break;
		}
		
	} while (exit != 0);

	}

public static void showMuvies() {
	int exit = 1;
	ArrayList<Movie> movies = Movie.makeMuvieList();//llamada al metodo makeMovie List, se muetra la lista de objetos
	do {
		System.out.println();
		System.out.println("::MOVIES::");
		System.out.println();
		
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
		}
		
		System.out.println("0. Regresar al menu");
		System.out.println();
		
		//Leer respuesta del usuario
		Scanner sc = new Scanner(System.in);
		int response = Integer.valueOf(sc.nextLine());
		//validar si la respuesta del usuario es 0 que regrese al menu
		if (response == 0) {
			showMenu();
		}
		
		Movie movieSelected = movies.get(response-1);
		movieSelected.setViewed(true);
		Date dateI = movieSelected.startToSee(new Date());
		
		for (int i = 0; i < 100000; i++) {
			System.out.println("..........");
		}
		
		//Al terminar de ver la pelicula
		movieSelected.stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Viste: " + movieSelected);
		System.out.println("Por : " + movieSelected.getTimeViewed() + "milisegundos");
		
	}while(exit != 0);
}

public static void showSeries() {
	int exit = 0;
	do {
		System.out.println();
		System.out.println("::Series::");
		System.out.println();
	}while(exit != 0);
}

public static void showChapters() {
	int exit = 0;
	do {
		System.out.println();
		System.out.println("::CHAPTERS::");
		System.out.println();
	}while(exit != 0);
}

public static void showBooks() {
	int exit = 0;
	do {
		System.out.println();
		System.out.println("::BOOKS::");
		System.out.println();
	}while(exit != 0);
}

public static void showMagazines() {
	int exit = 0;
	do {
		System.out.println();
		System.out.println("::MAGAZINES::");
		System.out.println();
	}while(exit != 0);
}

public static void makeReport() {
	
}

public static void makeReport(Date date) {
	
}



}
