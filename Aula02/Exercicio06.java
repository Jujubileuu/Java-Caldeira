package Aula02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer coisa: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra invertida fica: " + new StringBuilder(palavra).reverse());
    }
}
