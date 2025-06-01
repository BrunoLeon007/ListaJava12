package exercicios;

import java.util.Scanner;

public class SomadeDigitosdeNumeroInteiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();
		int soma = 0;

		for (; numero != 0; numero /= 10) {
		    soma += numero % 10;
		}
		System.out.println("Soma dos dígitos: " + soma);
		sc.close();
	}
	
}
