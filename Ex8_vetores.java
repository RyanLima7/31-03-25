package treinos;

import java.util.Scanner;

public class Ex8_vetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        
        System.out.println("Digite o valor para cada posição  ");

        // Preenchendo o primeiro vetor 
        // Usando \n para criar uma nova linha
        System.out.println("\nPreencha o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(i + ": ");
            vetor1[i] = sc.nextInt();
            
          
        }

        // Preenchendo o segundo vetor
        System.out.println("Preencha o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(i + ": ");
            vetor2[i] = sc.nextInt();
        }

        // Usando \n para criar a quebra de linha
        //Resultado 
        System.out.println("\nNúmeros iguais nas mesmas posições:");
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == vetor2[i]) {
                System.out.println("Posição " + i + ": " + vetor1[i]);
            }
        }

        sc.close();
    }
}
