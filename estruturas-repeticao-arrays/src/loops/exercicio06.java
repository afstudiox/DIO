package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class exercicio06 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nDigite um número para calcular seu fatorial: ");
            int numero = scanner.nextInt();

            long fatorial = 1;

            for (int i = numero; i > 0; i--) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

    }
}
