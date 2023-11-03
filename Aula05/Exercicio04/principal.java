package Aula05.Exercicio04;

import Aula05.Exercicio04.listaItens;

import java.util.*;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                            \n@LISTA DE COMPRAS@\s

                             1.Adicionar novo itens;
                             2.Ver lista de comprar;
                             3.Remover item;
                             4.Fechar lista"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nNome: ");
                    listaItens.setNome(scanner.nextLine());

                    System.out.println("Data de validade: ");
                    listaItens.setData(scanner.nextLine());

                    break;
                case "2":
                    System.out.println("\nLISTA:\n");
                    listaItens.getLista();
                    break;
                case "3":
                    System.out.println("\nDigite o item que quer remover: ");
                    listaItens.removerItem(scanner.nextLine());
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
}
