package Aula05.Exercicio06;

import java.util.*;

public class dadosReserva {
    static List<String> nome = new LinkedList<>();
    static List<String> local = new LinkedList<>();
    static List<Integer> cpf = new LinkedList<>();
    static List<String> dataEntrada = new LinkedList<>();
    static List<String> dataSaida = new LinkedList<>();

    public static void setNome(String nome) {
        dadosReserva.nome.add(nome);
    }

    public static void setLocal(String local) {
        dadosReserva.local.add(local);
    }

    public static void setCpf(Integer cpf) {
        dadosReserva.cpf.add(cpf);
    }

    public static void setDataEntrada(String dataEntrada) {
        dadosReserva.dataEntrada.add(dataEntrada);
    }

    public static void setDataSaida(String dataSaida) {
        dadosReserva.dataSaida.add(dataSaida);
    }

    public static void getReservas(){
        for (int i = 0; i < nome.size(); i++) {
            System.out.println(
                "\nNome da reserva: " + nome.get(i) + " | Local da reserva: "+ local.get(i) + "\n" +
                "CPF cadastrado: " + cpf.get(i) + "\n" +
                "Data de entrada: " + dataEntrada.get(i) + " | Data de Saída: " + dataSaida.get(i) + "\n"
            );
        }
    }
    public static void removerReserva(String remover){
        if (dadosReserva.nome.contains(remover)){
            int indice = dadosReserva.nome.indexOf(remover);

            dadosReserva.nome.remove(indice);
            dadosReserva.local.remove(indice);
            dadosReserva.cpf.remove(indice);
            dadosReserva.dataEntrada.remove(indice);
            dadosReserva.dataSaida.remove(indice);

            System.out.println("Reserva removida com sucesso.\n");
        } else {
            System.out.println("Reserva não encontrada.\n");
        }
    }
}
