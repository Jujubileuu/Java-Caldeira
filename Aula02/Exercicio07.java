package Aula02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("LEONIDAS: SOLDADO TENTE ADIVINHAR QUANTOS INIMIGOS IREMOS ENFRENTAR " +
                    "\ndigite um número inteiro: ");
            int inimigos = Integer.parseInt(scanner.nextLine());

            if (inimigos == 300000) {
                System.out.println("LEONIDAS: CORRETO SOLDADO! ISSO É ESPARTAAAAA!!! " +
                        "\n!Você Ganhou!");
                break;
            } else if (inimigos < 300000) {
                System.out.println("LEONIDAS: UM POUCO MAIS SOLDADO\n");
            } else if (inimigos > 300000) {
                System.out.println("LEONIDAS: UM POUCO MENOS SOLDADO\n");
            }
        }
    }
}
