package Aula06.Exercicio03;

import java.util.Scanner;

public class cadastrar extends agendaTelefonica{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        agenda.put(9999999, "Ricardo");
        localizacao.put("Parana", "Sul");
        agenda.put(2222222, "Abelha");
        localizacao.put("São Pedro", "Leste");
        agenda.put(3333333, "Abelha2");
        localizacao.put("São", "Leste");

        while (true) {
            System.out.println("""
                            \n@VILA PELICANOS@\s

                             1.Cadastrar nova Conta;
                             2.Ver todas as contas cadastradas;
                             3.Ver contas por localidade;
                             4.Fechar Programa"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nDigite o seu número de telefone (apenas números): ");
                    Integer numero = Integer.valueOf(scanner.nextLine());
                    System.out.println("\nDigite o seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("\nDigite o local da sua cidade (norte, sul, centro, leste e oeste): ");
                    String local = scanner.nextLine();
                    System.out.println("\nDigite seu endereço: ");
                    String endereco = scanner.nextLine();

                    setAgendaLocalizacao(numero, nome, local, endereco);
                    break;
                case "2":
                    getContatos();
                    break;
                case "3":
                    System.out.println("Informe um local(norte, sul, centro, leste e oeste):");
                    getContatoLocal(scanner.next());
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
}
