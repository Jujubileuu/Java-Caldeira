package Aula05.Exercicio04;

import java.util.*;

public class listaItens {
    static List<String> nome = new ArrayList<>();
    static List<String> data = new ArrayList<>();

    public static void setNome(String nome) {
        listaItens.nome.add(nome);
    }
    public static void setData(String data) {
        listaItens.data.add(data);
    }
    public static void getLista(){
        for (int i = 0; i < nome.size(); i++) {
            System.out.println(
                    "Item: "+ nome.get(i) +
                    "\nValidade: " + data.get(i));
        }
    }
    public static void removerItem(String nomeItem){
        if (listaItens.nome.contains(nomeItem)){
            listaItens.nome.remove(nomeItem);
            listaItens.data.remove(nomeItem);
            System.out.println("Item removida com sucesso.\n");
        } else {
            System.out.println("Item não encontrado.\n");
        }
    }
}
