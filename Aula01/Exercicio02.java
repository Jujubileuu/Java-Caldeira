package Aula01;
import java.util.Scanner;
import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite um número inteiro:");
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Os números foram " + numero1 + " e " + numero2);
    }
}
