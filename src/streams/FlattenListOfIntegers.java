package streams;

import java.util.List;

public class FlattenListOfIntegers {

    private static List<List<Integer>> listOfLists = List.of(
        List.of(1, 2),
        List.of(3),
        List.of(4, 5, 6)
    );

    public static void main(String[] args) {
        final List<Integer> numbers = listOfLists
            .stream()
            .flatMap(List::stream)
            .toList();
        System.out.println(numbers);
    }
}