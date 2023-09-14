package Aula02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código referente a sua condição:\n1.Deficiente\n2.Idosa\n3.Gestante\n4.Nenhuma das Anteriores");
        int codigo = Integer.parseInt(scanner.nextLine());

        if(codigo == 4){
            System.out.println("Você NÃO TEM direito a fila prioritária.");
        } else {
            System.out.println("Você TEM direito a fila prioritária.");
        }

        scanner.close();
    }
}

