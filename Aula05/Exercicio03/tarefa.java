package Aula05.Exercicio03;

import java.util.*;

public class tarefa {
    static List<String> titulo = new ArrayList<>();
    static List<String> data = new ArrayList<>();
    static List<String> descricao = new ArrayList<>();

    public static void setTitulo(String titulo) {
        tarefa.titulo.add(titulo);
    }

    public static void setData(String data) {
        tarefa.data.add(data);
    }

    public static void setDescricao(String descricao) {
        tarefa.descricao.add(descricao);
    }

    public static void getTodasTarefas(){
        for (int i = 0; i < titulo.size(); i++) {
            System.out.println(
                    titulo.get(i) + "\n" +
                    data.get(i) + "\n" +
                    descricao.get(i)
            );
        }
    }
    public static void removerTarefa(String tituloTarefa){
        if (tarefa.titulo.contains(tituloTarefa)){
            tarefa.titulo.remove(tituloTarefa);
            tarefa.data.remove(tituloTarefa);
            tarefa.descricao.remove(tituloTarefa);
            System.out.println("Tarefa removida com sucesso.\n");
        } else {
            System.out.println("Tarefa não encontrada.\n");
        }
    }
}
