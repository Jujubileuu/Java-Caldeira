package Aula05.Exercicio03;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                            \n@LISTA DE TAREFAS@\s

                             1.Adicionar nova tarefa;
                             2.Ver todas as tarefas;
                             3.Remover tarefa;
                             4.Fechar programa"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nTítulo: ");
                    tarefa.setTitulo(scanner.next());

                    System.out.println("Data de conclusão: ");
                    tarefa.setData(scanner.next());

                    System.out.println("Descrição: ");
                    tarefa.setDescricao(scanner.next());
                    break;
                case "2":
                    System.out.println("\nTAREFAS CRIADAS\n");
                    tarefa.getTodasTarefas();
                    break;
                case "3":
                    System.out.println("\nDigite o título da tarefa que quer remover: ");
                    tarefa.removerTarefa(scanner.next());
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
}
