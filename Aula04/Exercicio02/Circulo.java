package Aula04.Exercicio02;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    static double area;
    public static double getArea(double base, double altura) {
        return area;
    }
    @Override
    public void calcularArea(double raio, double pi) {
        System.out.print("Informe o raio: ");
        raio = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe o valor de pi: ");
        pi = Double.parseDouble(scanner.nextLine());
        area = (raio * raio) * pi;
    }
}
