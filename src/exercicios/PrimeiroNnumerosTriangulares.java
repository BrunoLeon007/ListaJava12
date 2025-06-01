package exercicios;

import java.util.Scanner;

public class PrimeiroNnumerosTriangulares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Numero para realizar o calculo: ");
		int Numero = sc.nextInt();
		int triangulo = 0;

		for (int total = 1; total <= Numero; total++) {
		    triangulo += total;
		    System.out.println("Triangular " + total + ": " + triangulo);
		}
sc.close();
	}

}
