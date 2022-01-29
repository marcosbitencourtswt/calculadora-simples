package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro numero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("A soma dos dois numeros é: " + soma);
		System.out.println("A subtração do dois numeros é: " + subtracao);
		System.out.println("A Divisão dos dois numeros é: " + divisao);
		System.out.println("A multiplicação dos dois numeros é:" + multiplicacao);
		
		
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	
	
}


