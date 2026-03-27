package com.duoc.ejemplos;

import java.util.Scanner;

public class RepeticionGanadora {

	public static void main(String[] args) {
		
		//el ganador es el numero 1234
		Scanner scanner = new Scanner(System.in);
		int ganador;
		System.out.println("Ingrese el numero ganador: ");
		ganador = scanner.nextInt();
		
		while(ganador != 1234) {
			System.out.println("Perdiste ! ");
			System.out.println("Intentelo de nuevo");
			ganador = scanner.nextInt();
		}
		
		System.out.println("Felicidades");
		scanner.close();
		

	}

}
