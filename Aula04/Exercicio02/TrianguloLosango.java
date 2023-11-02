package Aula04.Exercicio02;

import java.util.Scanner;

public class TrianguloLosango extends FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    static double area;
    public static double getArea(double base, double altura) {
        return area;
    }
    @Override
    public void calcularArea(double base, double altura) {
        System.out.print("Informe a base: ");
        base = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe a altura: ");
        altura = Double.parseDouble(scanner.nextLine());
        area = (base * altura) / 2;
    }
}
