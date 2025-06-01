package exercicios;

import java.util.Scanner;

public class SomadosDigitoscomIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Intervalo início: ");
		int inicio = sc.nextInt();
		System.out.print("Intervalo fim: ");
		int fim = sc.nextInt();

		int somaDigitos = 0;

		for (int numero = inicio; numero <= fim; numero++) {
		    if (numero % 2 == 0) {
		        int temp = numero;
		        for (; temp != 0; temp /= 10) {
		            somaDigitos += temp % 10;
		        }
		    }
		}
		System.out.println("Soma dos dígitos dos números pares: " + somaDigitos);
		sc.close();

	}

}
