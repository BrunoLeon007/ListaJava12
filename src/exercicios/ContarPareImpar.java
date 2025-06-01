package exercicios;

import java.util.Scanner;

public class ContarPareImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalPares = 0;
		int totalImpares = 0;
		for (int resultado = 1; resultado <= 10; resultado++) {
		    System.out.print("Número " + resultado + ": ");
		    int valor = sc.nextInt();
		    if (valor % 2 == 0) {
		        totalPares++;
		    } else {
		        totalImpares++;
		    }
		}
		System.out.println("Pares: " + totalPares + ", Ímpares: " + totalImpares);
sc.close();
	}

}
