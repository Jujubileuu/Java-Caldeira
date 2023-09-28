package Aula01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        System.out.print("Digite um horário (exemplo: 17:00:00): ");
        Date horario = sdf.parse(scanner.nextLine());
    }
}
