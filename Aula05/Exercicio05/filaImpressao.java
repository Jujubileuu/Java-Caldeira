package Aula05.Exercicio05;

import java.util.*;

public class filaImpressao {
    static List<String> nomeDocumento = new LinkedList<>();
    static List<Integer> numeroPaginas = new LinkedList<>();

    public static void setNomeDocumento(String nome) {
        filaImpressao.nomeDocumento.add(nome);
    }
    public static void setNumeroPaginas(Integer paginas) {
        filaImpressao.numeroPaginas.add(paginas);
    }

    public static void getTodasTarefas(){
        for (int i = 0; i < nomeDocumento.size(); i++) {
            System.out.println(
                    nomeDocumento.get(i) + "\n" +
                            numeroPaginas.get(i) + "\n"
            );
        }
    }
    public static void imprimirDocumento(){
        if (!filaImpressao.nomeDocumento.isEmpty()){
            System.out.println("\nImprimindo documentos");
            filaImpressao.nomeDocumento.removeAll(nomeDocumento);
            filaImpressao.numeroPaginas.removeAll(numeroPaginas);
            System.out.println("Documentos impressos com sucesso.\n");
        } else {
            System.out.println("\nNenhum documento para impressão encontrado.\n");
        }
    }
}

