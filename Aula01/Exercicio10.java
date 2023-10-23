package Aula01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius (apenas números): ");
        double celsius = Double.parseDouble(scanner.nextLine());

        System.out.println("A temperatura em Fahrenheit é: " + ((celsius * 9/5) + 32));
    }
}
