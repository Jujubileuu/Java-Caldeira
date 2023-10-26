package Aula01;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em dólares (ponto para os centavos): ");
        double dolar = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o câmbio atual da moeda de conversão desejada (ponto para os centavos): ");
        double cambioAtual = Double.parseDouble(scanner.nextLine());

        System.out.println("O valor convertido para a moeda desejada é: " + (dolar * cambioAtual));
    }
}
