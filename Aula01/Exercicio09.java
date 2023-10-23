package Aula01;

import java.util.*;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = GregorianCalendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = Integer.parseInt(scanner.nextLine());

        System.out.println("Sua idade é: " + (anoAtual - anoNascimento));
    }
}
