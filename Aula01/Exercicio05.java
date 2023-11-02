package Aula01;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.print("Digite um horário (exemplo: 17:00:00): ");
        LocalTime horario = LocalTime.parse(scanner.nextLine());

        System.out.println(horario);
    }
}
