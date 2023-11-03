package Aula06.Exercicio01;

import java.util.Scanner;

public class imprimirPilha extends livros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                            \n@PILHA DE LIVROS@\s

                             1.Adicionar novo livro;
                             2.Ver todos os livros;
                             3.Ver livros de uma categoria;
                             4.Remover todos os livros da pilha;
                             5.Fechar Pilha"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nTitulo: ");
                    setTitulo(scanner.nextLine());

                    System.out.println("Categoria: ");
                    setCategoria(scanner.nextLine());

                    break;
                case "2":
                    getPilha();
                    break;
                case "3":
                    System.out.println("Digite a categoria para visualização: ");
                    getPilhaCategoria(scanner.nextLine());
                    break;
                case "4":
                    removerPilha();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }
    }
}
