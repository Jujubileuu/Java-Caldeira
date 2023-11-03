package Aula05.Exercicio06;

import Aula05.Exercicio06.dadosReserva;

import java.util.*;

public class reserva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                            \n@LISTA DE COMPRAS@\s

                             1.Adicionar nova reserva;
                             2.Ver reservas;
                             3.Remover reserva;
                             4.Fechar programa"""
            );
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nNome da reserva: ");
                    dadosReserva.setNome(scanner.nextLine());

                    System.out.println("\nLocal: ");
                    dadosReserva.setLocal(scanner.nextLine());

                    System.out.println("\nCPF (apenas números): ");
                    dadosReserva.setCpf(Integer.valueOf(scanner.nextLine()));

                    System.out.println("\nData de entrada: ");
                    dadosReserva.setDataEntrada(scanner.nextLine());

                    System.out.println("\nData de saída: ");
                    dadosReserva.setDataSaida(scanner.nextLine());
                    break;
                case "2":
                    dadosReserva.getReservas();
                    break;
                case "3":
                    System.out.println("Digite o nome da reserva para remoção:");
                    dadosReserva.removerReserva(scanner.nextLine());
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
}
