package Aula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int intervalo = Integer.parseInt(scanner.nextLine());

        System.out.print("Os números primos são: ");
        for (int i = 0; i <= intervalo; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}
