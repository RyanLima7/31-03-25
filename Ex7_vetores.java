package src;

import java.util.Scanner;

public class Ex7_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc = new Scanner(System.in);
			double[] vetor = { 20.2, 30.7, 40.5, 50.9, 60.2 };
			int num;

			System.out.print("Digite um número: ");
			num = sc.nextInt();

			System.out.println("A multiplicação de cada número da lista é: ");
			for (double numero : vetor) {
				System.out.println(numero *= num);
			}
			sc.close();
		}
	}
}
