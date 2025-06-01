package exercicios;

import java.util.Scanner;

public class CaracterString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String letras = sc.nextLine();

		for (int quantidade = letras.length() - 1; quantidade >= 0; quantidade--) {
		    System.out.print(letras.charAt(quantidade));
		}
		System.out.println();
sc.close();
	}

}
