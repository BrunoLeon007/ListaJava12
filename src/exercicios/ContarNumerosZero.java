package exercicios;

import java.util.Scanner;

public class ContarNumerosZero {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		int zeroConta = 0;

		for (; numero != 0; numero /= 10) {
		    if (numero % 10 == 0) {
		        zeroConta++;
		    }
		}
		System.out.println("Número de dígitos zero: " + zeroConta);
sc.close();
	}

}
