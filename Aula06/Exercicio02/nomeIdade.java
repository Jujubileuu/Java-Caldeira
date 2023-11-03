package Aula06.Exercicio02;

import java.util.*;

public class nomeIdade {
    static Map<String, Integer> aldeoes = new HashMap<String, Integer>();

    public static void getAldeao(String nome){
        if (nomeIdade.aldeoes.containsKey(nome)) {
            System.out.println("\nA idade do aldeão selecionado é: ");
            System.out.print(nomeIdade.aldeoes.get(nome) + "\n");
        } else {
            System.out.println("O aldeão requisitado não existe.\n");
        }
    }
    public static void getTerceiraIdade(){
        System.out.println("\nALDEÕES DA VILA PELICANOS: TERCEIRA IDADE");
        for (Map.Entry<String, Integer> aldeao : aldeoes.entrySet()) {
            if (aldeao.getValue() >= 60) {
                System.out.print(aldeao.getKey() + ": " + aldeao.getValue() + "\n");
            }
        }
    }
}
