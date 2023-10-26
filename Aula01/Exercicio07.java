package Aula01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite seu salário, utilizando ponto para os centavos: ");
        double salario = Double.parseDouble(scanner.nextLine());

        if (idade >= 18 && salario > 2000) {
            System.out.println("Requisitos mínimos atendidos, compra liberada.");
        } else {
            System.out.println("Idade ou salário não batem os requisitos mínimos para compra.");
        }
    }
}
