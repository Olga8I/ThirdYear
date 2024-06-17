package org.example;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        String text = "This is a test text to find the most frequent characters";

        int n = 3;

        Map<Character, Long> charFrequencies = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map.Entry<Character, Long> mostFrequent = charFrequencies.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();

        char mostFrequentChar = mostFrequent.getKey();
        long frequency = mostFrequent.getValue();

        String nMostFrequentChars = charFrequencies.entrySet().stream()
                .filter(entry -> !entry.getKey().equals(mostFrequentChar))
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Most frequent character is '" + mostFrequentChar + "' with frequency of " + frequency);
        System.out.println("Top " + n + " most frequent characters (excluding the most frequent): " + nMostFrequentChars);
    }
}