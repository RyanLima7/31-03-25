package treinoRyan;

import java.util.Scanner;

public class Ex_vetores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[8];

		System.out.println("Digite 8 números:");

		for (int i = 0; i < 8; i++) {

			vetor[i] = sc.nextInt();
		}

		int maior = vetor[0], menor = vetor[0];

		for (int i = 1; i < 8; i++) {
			if (vetor[i] >= maior); {
				
			}
			if (vetor[i] <= menor); {
			
			}
		}

	
		System.out.print("Vetor: ");

		for (int num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println(" ");

		
		System.out.println("Maior número: " + maior);

		System.out.println("Menor número: " + menor);

		sc.close();
	}
}
