package Aula01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer número inteiro positivo: ");
        int numero = Integer.parseInt(scanner.nextLine());
        int fatorial = numero;

        for (int i = 1; i < numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
