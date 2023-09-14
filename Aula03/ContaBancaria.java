package Aula03;

import java.time.LocalTime;

public class ContaBancaria {
    public String nomeTitular;
    private int cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    public int horario;

    public void saque (double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Err0r");
        }
    }
    public void deposito (double valor) {
        this.saldo += valor;
    }
    public void pix (double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            verificarHorario();
        } else {
            System.out.println("Err0r");
        }
    }
    public double verificarSaldo() {
        return this.saldo;
    }
    public int verificarHorario() {
        this.horario = LocalTime.now().getHour();
        return this.horario;
    }
    public String verificarInformacoes() {
        System.out.println("Nome| " + nomeTitular + "\nCPF| " + this.cpf + "\nIdentificação| " + this.identificadorConta + "\nBanco| " + this.banco + "\nEndereço| " + this.endereco + "\nSaldo| " + this.saldo + "\nHorário| " + verificarHorario());
        return null;
    }
}