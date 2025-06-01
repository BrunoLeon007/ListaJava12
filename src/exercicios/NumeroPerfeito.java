package exercicios;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		int somaDivisores = 0;

		for (int resultado = 1; resultado < numero; resultado++) {
		    if (numero % resultado == 0) {
		        somaDivisores += resultado;
		    }
		}

		if (somaDivisores == numero) {
		    System.out.println(numero + " é um número perfeito.");
		} else {
		    System.out.println(numero + " NÃO é um número perfeito.");
		}
sc.close();
	}

}
