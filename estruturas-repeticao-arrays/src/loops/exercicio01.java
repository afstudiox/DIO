package loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class exercicio01 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String nome;
            int idade;

            while(true) {
                System.out.print("\nDigite o nome do aluno: ");
                nome = scanner.next();

                if (nome.equals("0")) {
                    break;
                }

                System.out.print("Digite a idade do aluno: ");
                idade = scanner.nextInt();

                System.out.println("Nome: " + nome + " | Idade: " + idade + "\n");
            }
        }

        ;
    }
}
