package Aula02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String palavra = scanner.nextLine();
        String[] corte = {palavra.substring(0, palavra.length()/2),palavra.substring(palavra.length()/2)};

        System.out.println("A primeira metade da palavra inserida é: " + corte[0]);
    }
}
