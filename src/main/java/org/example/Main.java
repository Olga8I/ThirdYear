package org.example;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit Duis sagittis turpis sit amet lectus dapibus accumsan Fusce gravida tellus quis";

        Map<String, Long> result = Stream.of(text.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        result.forEach((word, count) -> System.out.println(word + " - " + count));
    }
}