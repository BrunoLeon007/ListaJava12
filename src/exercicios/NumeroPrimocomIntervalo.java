package exercicios;

import java.util.Scanner;

public class NumeroPrimocomIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Intervalo início: ");
		int inicio = sc.nextInt();
		System.out.print("Intervalo fim: ");
		int fim = sc.nextInt();

		for (int numero = inicio; numero <= fim; numero++) {
		    if (numero > 1) {
		        boolean primo = true;
		        for (int resultado = 2; resultado <= Math.sqrt(numero); resultado++) {
		            if (numero % resultado == 0) {
		                primo = false;
		                break;
		            }
		        }
		        if (primo) {
		            System.out.println(numero);
		            sc.close();
		        }
		    }
		}

	}

}
