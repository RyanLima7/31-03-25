package abrill;

import java.util.Scanner;

public class ex1_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int vetor[] = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Digite o número " + i );
			vetor[i] = sc.nextInt();
		}
		// Abaixo esta em ordem crescente
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(vetor[i] + " ");
		}

	}
}
