package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "РАССИЯ РАДИНА";
        String correctedText = Arrays.stream(text.split("\\s+"))
                .map(word -> word.replaceAll("А(?!$)", "О"))
                .collect(Collectors.joining(" "));
        System.out.println(correctedText);
    }
}