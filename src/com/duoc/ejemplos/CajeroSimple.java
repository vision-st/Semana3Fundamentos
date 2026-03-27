package com.duoc.ejemplos;

import java.util.Scanner;

public class CajeroSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double saldo = 100000;
		int opcion = 0;
		
		while (opcion != 4) {
			System.out.println("\n======== CAJERO ==========");
			System.out.println("1. Consultar Saldo");
			System.out.println("2. Depositar");
			System.out.println("3. Girar");
			System.out.println("4. Salir");
			System.out.println("Seleccione una opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case 1: 
					System.out.println("Su saldo es de : " + saldo);
					break;
				case 2:
					System.out.println("Ingrese el monto a depositar: $ ");
					double deposito = scanner.nextDouble();
					
					if(deposito > 0) {
						saldo = saldo + deposito;
						System.out.println("Deposito realizado con exito.");
						System.out.println("Nuevo Saldo: " + saldo);
					}else {
						System.out.println("Error: el monto debe ser mayor a 0");
					}
					break;
				case 3:
					System.out.println("Ingrese el monto a girar: $ ");
					double giro = scanner.nextDouble();
					if(giro > 0) {
						if(giro <= saldo) {
							saldo = saldo - giro;
							System.out.println("Giro realizado con exito.");
							System.out.println("Nuevo Saldo: " + saldo);
						}else {
							System.out.println("Error: Saldo insuficiente");
						}
					}else {
						System.out.println("Error: el monto debe ser mayor a 0");
					}
					break;
				case 4:
					System.out.println("Gracias por usar el cajero.");
					break;
				default:
					System.out.println("Opcion invalida...");
					break;
			}
		}
		scanner.close();
	}
}
