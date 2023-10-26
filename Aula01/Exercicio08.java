package Aula01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ESCOLHA UMA DAS OPÇÕES PELO SEU NÚMERO:\s
                1.GESTANTE\s
                2.IDOSA\s
                3.PCD\s
                4.NENHUMA DAS ALTERNATIVAS""");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1, 2, 3:
                System.out.println("POSSUI DIREITO A FILA PRIORITÁRIA");
                break;
            case 4:
                System.out.println("NÃO POSSUI DIREITO A FILA PRIORITÁRIA");
                break;
        }
    }
}
