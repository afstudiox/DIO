package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

public class exercicio02 {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nDigite uma nota entre 0 e 10: ");
            int nota = scanner.nextInt();

            while(nota < 0 || nota > 10) {
                System.out.print("Nota inválida! \n\nDigite uma nota entre 0 e 10: ");
                nota = scanner.nextInt();
            }

            System.out.println("Nota válida: " + nota + "\n");
        }
    }
}
