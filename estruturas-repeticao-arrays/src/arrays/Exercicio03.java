package arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] sucessores = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
            sucessores[i] = numeros[i] + 1;
        }

        System.out.println("Números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nSucessores: ");
        for (int i = 0; i < sucessores.length; i++) {
            System.out.print(sucessores[i] + " ");
        }
    }
}
