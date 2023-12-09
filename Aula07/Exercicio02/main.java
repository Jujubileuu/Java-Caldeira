package Aula07.Exercicio02;

import java.util.Scanner;

import static Aula07.Exercicio02.DiaDaSemana.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum dia da semana (sem incluir 'feira' ao final e sem acento): ");
        DiaDaSemana opcao = DiaDaSemana.valueOf(String.valueOf((scanner.nextLine().toUpperCase().trim())));

        switch (opcao) {
            case DOMINGO:
                System.out.println(DOMINGO.mensagem);
                break;
            case SEGUNDA:
                System.out.println(SEGUNDA.mensagem);
                break;
            case TERCA:
                System.out.println(TERCA.mensagem);
                break;
            case QUARTA:
                System.out.println(QUARTA.mensagem);
                break;
            case QUINTA:
                System.out.println(QUINTA.mensagem);
                break;
            case SEXTA:
                System.out.println(SEXTA.mensagem);
                break;
            case SABADO:
                System.out.println(SABADO.mensagem);
                break;
        }
    }
}
