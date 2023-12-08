package Aula07;

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
