package com.ipartek.ejercicios.generales;

public class ejercicio01 {
	public static void main(String[] args) {
		int a = 5, b = 8, aux = 0;
		
		System.out.printf("Valores iniciales: %d, %d", a, b);
		
		aux = a;
		a = b;	
		b = aux;
		
		System.out.println();
		
		System.out.printf("Valores intercambiados: %d, %d", a, b);
	}
}
