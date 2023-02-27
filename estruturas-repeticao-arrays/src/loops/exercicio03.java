package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class exercicio03 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int maior = 0;
            int soma = 0;

            for (int i = 0; i < 5 ; i++) {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
                if (numero > maior) {
                    maior = numero;
                }
                soma += numero;
            }

            System.out.println("Maior número: " + maior);
            System.out.println("Média: " + soma / 5);
        }

    }
}
