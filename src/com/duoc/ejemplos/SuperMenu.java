package com.duoc.ejemplos;

import java.util.Scanner;

public class SuperMenu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seleccione una opción:");
		System.out.println("a. Consultar Saldo");
		System.out.println("b. Depositar");
		System.out.println("c. Salir");
		
		//int opcion = scanner.nextInt();
		//char opcion = scanner.next().charAt(0);
		String opcion = scanner.nextLine();
		
		switch (opcion) {
			
			case "a":
				System.out.println("Saldo: $1000");
				break;
			case "b":
				System.out.println("Deposito realizado");
				break;
			case "c":
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion Invalida");
		}
		scanner.close();
		
		
		
		
		
		

	}

}
