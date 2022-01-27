package ar.com.educationit.semana9;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		int opcion=0;
		menu.mostrarMenu();
		Scanner teclado = new Scanner(System.in);
		opcion=teclado.nextInt();
		do {
			opcion=teclado.nextInt();
			menu.mostrarMenu();
		}while(opcion!=0);
		
		teclado.close();
	}

}
