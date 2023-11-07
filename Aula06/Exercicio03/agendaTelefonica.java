package Aula06.Exercicio03;

import Aula06.Exercicio01.livros;
import Aula06.Exercicio02.nomeIdade;

import java.util.*;

public class agendaTelefonica {
    static Map<Integer, String> agenda = new TreeMap<Integer, String>();
    static Map<String, String> localizacao = new TreeMap<String, String>();

    public static void setAgendaLocalizacao(Integer numero, String nome, String local, String endereco) {
        agendaTelefonica.agenda.put(numero, nome);
        agendaTelefonica.localizacao.put(endereco, local);
    }

    public static void getContatos(){
        Set<Map.Entry<Integer, String>> entryAgenda = agenda.entrySet();
        Map.Entry[] arrayAgenda = entryAgenda.toArray(new Map.Entry[0]);

        Set<Map.Entry<String, String>> entryLocalizacao = localizacao.entrySet();
        Map.Entry[] arrayLocalizacao = entryLocalizacao.toArray(new Map.Entry[0]);

        System.out.println("\nTODOS OS CONTATOS");
        for (int i = 0; i < arrayAgenda.length; i++) {
            System.out.println("Nome: " + arrayAgenda[i].getValue() + " | Telefone: " + arrayAgenda[i].getKey());
            System.out.println("Local: " + arrayLocalizacao[i].getValue() + " | Endereço: " + arrayLocalizacao[i].getKey());
        }
    }

    public static void getContatoLocal(String local){
        Set<Map.Entry<Integer, String>> entryAgenda = agenda.entrySet();
        Map.Entry[] arrayAgenda = entryAgenda.toArray(new Map.Entry[0]);

        Set<Map.Entry<String, String>> entryLocalizacao = localizacao.entrySet();
        Map.Entry[] arrayLocalizacao = entryLocalizacao.toArray(new Map.Entry[0]);

        for (int i = 0; i < arrayAgenda.length; i++) {
            if (arrayLocalizacao[i].getValue().equals(local)){
                System.out.println("Nome: " + arrayAgenda[i].getValue() + " | Telefone: " + arrayAgenda[i].getKey());
                System.out.println("Local: " + arrayLocalizacao[i].getValue() + " | Endereço: " + arrayLocalizacao[i].getKey());
            }
        }
    }
}
