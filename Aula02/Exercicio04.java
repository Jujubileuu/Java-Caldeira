package Aula02;

import java.util.Objects;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.print("Primeiro número: ");
            int numero1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Segundo número: ");
            int numero2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Operação (+, -, *, /): \n");
            String operacao = scanner.nextLine();

            if(Objects.equals(operacao, "+")) {
                System.out.print("O resultado é: " + (numero1 + numero2));
            } else if (Objects.equals(operacao, "-")) {
                System.out.print("O resultado é: " + (numero1 - numero2));
            } else if (Objects.equals(operacao, "*")) {
                System.out.print("O resultado é: " + (numero1 * numero2));
            } else if (Objects.equals(operacao, "/")) {
                System.out.print("O resultado é: " + (numero1 / numero2));
            }

            System.out.println("\nNovo cálculo? (S = Sim | N = Não): ");
            if (Objects.equals(scanner.nextLine(), "N")) {
                continua = false;
            }
        }
    }
}
