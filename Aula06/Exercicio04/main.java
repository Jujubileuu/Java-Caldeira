package Aula06.Exercicio04;

import java.util.*;

import static Aula06.Exercicio04.produtos.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    \n@VILA PELICANOS@\s

                     1.Cadastrar novo produto;
                     2.Ver todos os produtos no sistema;
                     4.Fechar Programa"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nDigite o nome do produto: ");
                    String produto = scanner.nextLine();
                    System.out.println("\nDigite o preço: ");
                    Double preco = Double.valueOf(scanner.nextLine());

                    setProdutos(produto, preco);
                    break;
                case "2":
                    getProdutos();
                    break;
                case "3":
                    System.exit(0);
                    break;
            }
        }
    }
}
