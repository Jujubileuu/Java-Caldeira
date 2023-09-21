package Aula04;

public abstract class Exercicio01Regras {
    private String Marca;
    private String Modelo;
    private int Ano;

    public String getMarca(){
        return this.Marca;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public int getAno(){
        return this.Ano;
    }
    public void setMarca(String marca){
        this.Marca = marca;
    }
    public void setModelo(String modelo){
        this.Modelo = modelo;
    }
    public void setAno(int ano){
        this.Ano = ano;
    }

    public abstract double calcularCustoViagem(int distancia);
}
