package Aula04;

public class Exercicio01Carro extends Exercicio01Regras {
    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia*0.20;
    }
    public static void main(String[] args) {
        Exercicio01Regras regras = new Exercicio01Carro();

        regras.setMarca("Fiat");
        regras.setModelo("Uno");
        regras.setAno(2020);

        System.out.print("--SEU CARRINHO--\n" + "Marca: " + regras.getMarca() + "\nModelo: " + regras.getModelo() + "\nAno: " + regras.getAno());
        System.out.print("\nCusto da viagem: R$" + regras.calcularCustoViagem(30));
    }
}
