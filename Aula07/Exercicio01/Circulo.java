package Aula07.Exercicio01;

public class Circulo implements Desenhavel {
    @Override
    public String desenhar() {
        System.out.print("Vou desenhar agora um Circulo");
        return null;
    }
    public static void main(String[] args) {
        Desenhavel Figura = new Circulo();
        Figura.desenhar();
    }
}
