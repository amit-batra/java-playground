package streams;

import java.util.List;
import java.util.stream.Stream;

public class InfiniteStreamFromUnaryOperator {
    public static void main(String[] args) {
        final Stream<Integer> infiniteStream = Stream.iterate(0, n -> n - 1);
        final List<Integer> listOfIntegers = infiniteStream
            .takeWhile(n -> n > -10)
            .toList();

        System.out.println(listOfIntegers);
    }
}
