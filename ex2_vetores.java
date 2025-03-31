package abrill;
import java.util.Random;

public class ex2_vetores {
	public static void main(String[] args) {
		Random random = new Random();

		// Criação do vetor de 10 números inteiros
		int[] vetor = new int[10];

		// Preenchendo o vetor com números aleatórios entre 1 e 100
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100) + 1; // Gera números entre 1 e 100
		}

		// Exibindo os números gerados
		System.out.print("Números gerados: ");
		for (int num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Calculando a soma dos elementos do vetor
		int somaTotal = 0;
		for (int num : vetor) {
			somaTotal += num;
		}

		// Exibindo a soma total
		System.out.println("Soma total: " + somaTotal);
	}
}
