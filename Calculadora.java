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
		
		System.out.println("A soma dos dois numeros �: " + soma);
		System.out.println("A subtra��o do dois numeros �: " + subtracao);
		System.out.println("A Divis�o dos dois numeros �: " + divisao);
		System.out.println("A multiplica��o dos dois numeros �:" + multiplicacao);
		
		
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


