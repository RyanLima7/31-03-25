package exercicios_vetores;

import java.util.Scanner;

public class Ex9_vetores {

    public static void main(String[] args) {
        System.out.println("Bem-vindo! Vamos separar os números pares e ímpares.");

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contPares] = numeros[i];
                contPares++;
            } else {
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }

        System.out.print("Números pares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nNúmeros ímpares: ");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        sc.close();
    }
}
