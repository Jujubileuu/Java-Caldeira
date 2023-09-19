package Aula01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário:");
        double salarioUser = Double.parseDouble(scanner.nextLine());

        System.out.print("O total de salários mínimos que você ganha é: " + (salarioUser/1320));

    }
}
