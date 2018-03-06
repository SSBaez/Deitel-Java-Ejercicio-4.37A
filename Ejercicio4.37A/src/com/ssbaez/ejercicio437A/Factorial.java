package com.ssbaez.ejercicio437A;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int j = 1;
		int fac = 0;
		
		System.out.println("Programa que lee un numero y calcula e imprime su factorial");
		System.out.print("Ingrese un numero: ");
		int n = input.nextInt();
		
		if(n > 0) {
			
			fac = n;
			
			while(i != (n-1)) {
					
				fac *= n - j;
				
				j++;
				i++;

			}
			
			System.out.printf("El factorial es: %d", fac);
			
		}
		else {
			System.out.println("El factorial es: 1");
		}
		
	}

}
