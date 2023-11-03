package Aula06.Exercicio01;

import Aula05.Exercicio04.listaItens;

import java.util.*;

public class livros {
    static Stack<String> titulo = new Stack<>();
    static Stack<String> categoria = new Stack<>();

    public static void setTitulo(String titulo) {
        livros.titulo.add(titulo);
    }

    public static void setCategoria(String categoria) {
        livros.categoria.add(categoria);
    }

    public static void getPilhaCategoria(String categoria){
        System.out.println("\nLIVROS DA CATEGORIA: " + categoria);
        for (int i = 0; i < titulo.size(); i++) {
            if (Objects.equals(livros.categoria.get(i), categoria)) {
                System.out.println("Título: " + livros.titulo.get(i) + " | Categoria: " + livros.categoria.get(i));
            }
        }
    }

    public static void getPilha(){
        System.out.println("\nTODOS OS LIVROS");
        for (int i = 0; i < titulo.size(); i++) {
            System.out.println("Título: "+ titulo.get(i) + " | Categoria: " + categoria.get(i));
        }
    }

    public static void removerPilha(){
        for (int i = 0; i < titulo.size(); i++) {
            System.out.println("\nRemovendo: " + livros.titulo.get(i));
            livros.titulo.remove(i);
            livros.categoria.remove(i);
            i--;
        }
    }
}
