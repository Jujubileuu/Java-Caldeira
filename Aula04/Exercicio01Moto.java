package Aula04;

public class Exercicio01Moto extends Exercicio01Regras {
    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia*0.15;
    }
    public static void main(String[] args) {
        Exercicio01Regras regras = new Exercicio01Moto();

        regras.setMarca("Honda");
        regras.setModelo("RTX4600");
        regras.setAno(2077);

        System.out.print("--SUA MOTINHA--\n" + "Marca: " + regras.getMarca() + "\nModelo: " + regras.getModelo() + "\nAno: " + regras.getAno());
        System.out.print("\nCusto da viagem: R$" + regras.calcularCustoViagem(30));
    }
}
