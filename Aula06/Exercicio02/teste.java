package Aula06.Exercicio02;

import java.util.Scanner;

public class teste extends nomeIdade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        aldeoes.put("Alex", 23);
        aldeoes.put("Elliot", 30);
        aldeoes.put("Harvey", 27);
        aldeoes.put("Sam", 23);
        aldeoes.put("Sebastian", 24);
        aldeoes.put("Shane", 28);
        aldeoes.put("Abigail", 19);
        aldeoes.put("Emily", 26);
        aldeoes.put("Haley", 20);
        aldeoes.put("Leah", 26);
        aldeoes.put("Maru", 22);
        aldeoes.put("Penny", 21);
        aldeoes.put("Caroline", 37);
        aldeoes.put("Clint", 29);
        aldeoes.put("Demetrius", 38);
        aldeoes.put("Evelyn", 78);
        aldeoes.put("Feiticeiro", 312678);
        aldeoes.put("George", 81);
        aldeoes.put("Gus", 53);
        aldeoes.put("Jas", 8);
        aldeoes.put("Jodi", 43);
        aldeoes.put("Kent", 45);
        aldeoes.put("Lewis", 54);
        aldeoes.put("Linus", 58);
        aldeoes.put("Marnie", 51);
        aldeoes.put("Pam", 999);
        aldeoes.put("Pierre", 36);
        aldeoes.put("Robin", 36);
        aldeoes.put("Vincent", 7);
        aldeoes.put("Willy", 62);
        aldeoes.put("Gil", 71);
        aldeoes.put("Gunther", 50);
        aldeoes.put("Marlon", 57);
        aldeoes.put("Morris", 43);

        while (true) {
            System.out.println("""
                            \n@VILA PELICANOS@\s

                             1.Ver idade por nome;
                             2.Ver todos da terceira idade;
                             3.Fechar Programa"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nDigite o nome do aldeão: ");
                    getAldeao(scanner.nextLine());
                    break;
                case "2":
                    getTerceiraIdade();
                    break;
                case "3":
                    System.exit(0);
                    break;
            }
        }
    }
}
