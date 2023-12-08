package Aula06.Exercicio04;

import java.util.*;

public class produtos {
    static LinkedHashMap<String, Double> produtosList = new LinkedHashMap<>();

    public static void setProdutos(String produto, Double preco) {
        produtosList.put(produto, preco);
    }

    public static void getProdutos() {
        System.out.println("\nPRODUTOS CADASTRADOS");
        for (Map.Entry<String, Double> produto : produtosList.entrySet())
            System.out.print(produto.getKey() + ": R$" + produto.getValue() + "\n");
    }
}
