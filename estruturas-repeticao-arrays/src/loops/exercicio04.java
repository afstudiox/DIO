package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class exercicio04 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int quantidadeNumeros;
            int pares = 0;
            int impares = 0;

            System.out.print("Quantos números deseja digitar? ");
            quantidadeNumeros = scanner.nextInt();

            for (int i = 0; i < quantidadeNumeros; i++) {
                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);
        }
    }
}
