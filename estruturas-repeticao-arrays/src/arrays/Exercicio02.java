package arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Exercicio02 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            char [] caracteres = new char[6];
            int quantidadeConsoantes = 0;
            String vogais = "aeiouAEIOU";
            String consoantes = "";

            // Percorre o vetor de caracteres para ler os caracteres
            for (int i = 0; i < caracteres.length; i++){
                System.out.print("Digite um caracter: ");
                caracteres[i] = input.next().charAt(0);
                if (vogais.indexOf(caracteres[i]) == -1) { // o inteiro -1 é retornado quando o caracter não é encontrado
                    quantidadeConsoantes++; // quando não encontrado incrementa o contador de consoantes
                    consoantes += caracteres[i]; // concatena o caracter na string de consoantes
                }
            }

            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
            System.out.println("Consoantes: " + consoantes);
        }

    }
}
