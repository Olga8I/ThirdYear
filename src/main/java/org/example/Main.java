package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ, открывающий рамку: ");
        String openSymbol = scanner.nextLine();

        System.out.print("Введите символ, закрывающий рамку: ");
        String closeSymbol = scanner.nextLine();

        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

            String result = stream
                    .map(line -> line.replaceAll(String.format("(?s)%s.*?%s", openSymbol, closeSymbol), ""))
                    .collect(Collectors.joining("\n"));

            System.out.println("Результат:");
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
