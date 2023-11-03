package Aula05.Exercicio05;

import Aula05.Exercicio05.filaImpressao;

import java.util.*;

public class impressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                            \n@LISTA DE COMPRAS@\s

                             1.Adicionar novo itens;
                             2.Imprimir documentos;
                             3.Fechar lista"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nNome do Documento: ");
                    filaImpressao.setNomeDocumento(scanner.nextLine());

                    System.out.println("Número de páginas: ");
                    filaImpressao.setNumeroPaginas(Integer.valueOf(scanner.nextLine()));
                    break;
                case "2":
                    filaImpressao.imprimirDocumento();
                    break;
                case "3":
                    System.exit(0);
                    break;
            }
        }
    }
}

