package Aula05;
import java.util.Scanner;
import java.util.*;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){
            System.out.print("Digite um número inteiro: ");
            listaNumeros.add(Integer.parseInt(scanner.nextLine()));
        }
        int listaSoma = listaNumeros.stream(). mapToInt(Integer::intValue). sum();
        System.out.print("A lista criada é: " + listaNumeros + "\nA soma da lista é: " + listaSoma + "\nA média da lista é: " + listaSoma/5);
    }
}
