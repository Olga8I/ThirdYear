package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Enter the letter number to replace: ");
        int k = scanner.nextInt();
        System.out.println("Enter the character to replace: ");
        char symbol = scanner.next().charAt(0);

        String result = Arrays.stream(text.split(" "))
                .map(word -> {
                    if (k <= word.length()) {
                        char[] chars = word.toCharArray();
                        chars[k - 1] = symbol;
                        return new String(chars);
                    } else {
                        return word;
                    }
                })
                .reduce((acc, word) -> acc + " " + word)
                .orElse("");

        System.out.println("Result: " + result);
    }
}