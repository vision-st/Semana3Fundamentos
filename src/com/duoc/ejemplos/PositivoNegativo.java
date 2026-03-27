package com.duoc.ejemplos;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			System.out.println("El numero es positivo");
		} else if(numero < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es " + numero);
		}
		
		
		if (numero % 2 == 0) {
		    System.out.println("Par");
		} else {
		    System.out.println("Impar");
		}
		
		scanner.close();
	}

}
