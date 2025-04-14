package abrill;

import java.util.Scanner;

public class ex4_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[6];

		System.out.println("Digite 6 números:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
			
		}
			

		System.out.println("Vetor original: ");
		for (int valor : vetor) {
			;
			System.out.print(valor + " ");
			System.out.print(" ");
		}
		
		

		System.out.println("Vetor invertido: ");	System.out.print(" ");
		for (int i = vetor.length - 1; i >= 0; i--) 
		{
			System.out.print(vetor[i] + " ");
		}

		scanner.close();
	}
}
