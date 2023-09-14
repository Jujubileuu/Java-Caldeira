package Aula02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade:");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Qual seu salário (sem suporte para os centavos):");
        double salario = Integer.parseInt(scanner.nextLine());

        if (idade >= 18 && salario >= 2000) {
            System.out.print("Eu te deixo comprar o meu carro " + nome);
        } else {
            System.out.print("Saia " + nome);
        }

        scanner.close();
    }
}
