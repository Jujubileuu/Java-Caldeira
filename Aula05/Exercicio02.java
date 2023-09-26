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

        if (listaNumeros == true) {
            System.out.print("Você acertou, a vitória é sua.");
        } else {
            System.out.print("Yoaimo");
        }
    }
}
