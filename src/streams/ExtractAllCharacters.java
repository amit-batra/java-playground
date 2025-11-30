package streams;

import java.util.List;

public class ExtractAllCharacters {
    
    private static List<String> words = List.of("java", "code");

    public static void main(String[] args) {

        final List<String> characters = words
            .stream()
            .flatMapToInt(String::chars)
            .mapToObj(number -> String.valueOf((char)number))
            .toList();

        System.out.println(characters);
    }
}
