package Aula05;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        List<Integer> listaNumeros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            listaNumeros.add(rand.nextInt(100));
        }

        //System.out.println(listaNumeros); Usado para testar a vitória

        System.out.print("Digite qualquer número inteiro:");
        int Jogador = Integer.parseInt(scanner.nextLine());

        if (listaNumeros.contains(Jogador)) {
            System.out.print("Ryomen Sukuna: Orgulhe-se, pois você é forte.");
        } else {
            System.out.print("Satoru Gojo: Yoaimo (Você é fraco).");
        }
    }
}