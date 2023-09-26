package Aula04.Exercicio01;

public class Carro extends Regras {
    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia*0.20;
    }
    public static void main(String[] args) {
        Regras regras = new Carro();

        regras.setMarca("Fiat");
        regras.setModelo("Uno");
        regras.setAno(2020);

        System.out.print("--SEU CARRINHO--\n" + "Marca: " + regras.getMarca() + "\nModelo: " + regras.getModelo() + "\nAno: " + regras.getAno());
        System.out.print("\nCusto da viagem: R$" + regras.calcularCustoViagem(30));
    }
}
