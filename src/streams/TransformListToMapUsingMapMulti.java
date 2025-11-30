package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of integers (e.g. [1, 2, 3, 4, 5]), convert it into a Map<Integer,String> that
 * captures whether each integer in the original list is odd or even. e.g.
 * {
 *   1: "Odd",
 *   2: "Even",
 *   3: "Odd",
 *   4: "Even",
 *   5: "Odd"
 * }
 */
public class TransformListToMapUsingMapMulti {

    private static final List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5);

    private static final String ODD = "Odd";
    private static final String EVEN = "Even";

    public static void main(String[] args) {
        inefficientImplementationWithMultiMap();
        efficientImplementationWithoutMultiMap();
    }

    private static void inefficientImplementationWithMultiMap() {
        final Map<Integer, String> result = listOfNumbers
            .stream()
            .<Map.Entry<Integer, String>>mapMulti((number, downstream) -> {
                if (number % 2 == 0)
                    downstream.accept(Map.entry(number, EVEN));
                else
                    downstream.accept(Map.entry(number, ODD));
            })
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }

    private static void efficientImplementationWithoutMultiMap() {
        final Map<Integer, String> result = listOfNumbers
            .stream()
            .collect(Collectors.toMap(
                number -> number,                           // key: the number itself
                number -> (number % 2 == 0) ? EVEN : ODD    // value: Odd or Even
            ));

        System.out.println(result);
    }
}