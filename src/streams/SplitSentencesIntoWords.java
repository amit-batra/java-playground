package streams;

import java.util.Arrays;
import java.util.List;

public class SplitSentencesIntoWords {

    private static List<String> sentences = List.of(
        "hello world",
        "java streams are powerful"
    );

    public static void main(String[] args) {

        List<String> words = sentences
            .stream()
            .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
            .toList();
        System.out.println(words);
    }
}