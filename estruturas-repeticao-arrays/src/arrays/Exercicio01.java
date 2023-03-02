package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exercicio01 {
    public static void main(String[] args) {

        int [] numeros = {1, 2, 3, 4, 5, 6};


        System.out.print("\nVetor Original  : ");

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }

        System.out.print("\nVetor Invertido : ");

        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.print(numeros[i]+ " ");
        }

        System.out.println("\n");

    }
}
