//package Aula04.Exercicio02;
//
//import java.util.Scanner;
//import Aula04.Exercicio02.QuadradoRetangulo;
//import Aula04.Exercicio02.Circulo;
//import Aula04.Exercicio02.TrianguloLosango;
//
//public class Principal{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("QUAL ÁREA CALCULAR: " +
//                "1.QUADRADO " +
//                "2.RETÂNGULO " +
//                "3.TRIÂNCULO " +
//                "4. CÍRCULO " +
//                "5.LOSANGO");
//        int opcao = Integer.parseInt(scanner.nextLine());
//
//        switch (opcao) {
//            case 1,2:
//
//                QuadradoRetangulo.getArea(1,2);
//                break;
//            case 3,5:
//                TrianguloLosango.getArea(1,2);
//                break;
//            case 4:
//                Circulo.getArea(1,2);
//                break;
//        }
//    }
//}
