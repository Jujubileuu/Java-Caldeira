package Aula01;

import java.util.*;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase();

        int vogaisQuant = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                vogaisQuant++;
            } else if (texto.charAt(i) == 'e') {
                vogaisQuant++;
            } else if (texto.charAt(i) == 'i') {
                vogaisQuant++;
            } else if (texto.charAt(i) == 'o') {
                vogaisQuant++;
            } else if (texto.charAt(i) == 'u') {
                vogaisQuant++;
            }
        }
        System.out.println("A quantidade de vogais é: " + vogaisQuant);
    }
}
