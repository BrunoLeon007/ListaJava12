package exercicios;

import java.util.Scanner;

public class MediaateNumeroNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int conta = 0;
		while (true) {
		    System.out.print("Digite um número (negativo para parar): ");
		    int num = sc.nextInt();
		    if (num < 0) break;
		    soma += num;
		    conta++;
		}
		if (conta > 0)
		    System.out.println("Média: " + (soma / conta));
		else
		    System.out.println("Nenhum dado válido para média");
sc.close();
	}

}
