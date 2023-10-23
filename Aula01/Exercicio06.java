package Aula01;
import java.util.*;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade < 16) {
            System.out.println("NÃO PODE VOTAR");
        } else if (idade <= 17) {
            System.out.println("VOTO FACULTATIVO");
        } else if (idade > 65) {
            System.out.println("VOTO FACULTATIVO");
        } else if (idade <= 65) {
            System.out.println("VOTO OBRIGATÓRIO");
        }
    }
}
