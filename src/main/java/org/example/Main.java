package org.example;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String text = "This is a sample text with the word 'example' written in it.";
        String substring = "ple";
        String insertWord = "insertion";

        String result = Arrays.stream(text.split("\\b"))
                .map(word -> word.endsWith(substring) ? word + " " + insertWord : word)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}