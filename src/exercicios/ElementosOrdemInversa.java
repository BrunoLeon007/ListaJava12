package exercicios;

import java.util.Scanner;

public class ElementosOrdemInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] lista = new int[5];
		for (int primeiro = 0; primeiro < lista.length; primeiro++) {
		    System.out.print("Elemento " + (primeiro+1) + ": ");
		    lista[primeiro] = sc.nextInt();
		}
		System.out.println("Lista invertida:");
		for (int segundo = lista.length - 1; segundo >= 0; segundo--) {
		    System.out.print(lista[segundo] + " ");
		}
		System.out.println();
sc.close();
	}

}
