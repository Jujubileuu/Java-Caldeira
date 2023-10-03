package Aula07.Exercicio01;

public class Quadrado implements Desenhavel {
    @Override
    public String desenhar() {
        System.out.print("Vou desenhar agora um Circulo");
        return null;
    }
    public static void main(String[] args) {
        Desenhavel Figura = new Quadrado();
        Figura.desenhar();
    }
}
