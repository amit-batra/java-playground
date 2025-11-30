package streams;

import java.util.stream.Stream;

public class StreamFromMapMulti {

    public static void main(String[] args) {

        // First create a stream of infinite integers like [1, 3, 5, 7, ...]
        final Stream<Integer> originalStream = Stream.iterate(1, n -> n + 2);

        // Now use mapMulti() operation to fill in the missing elements in the first stream
        final Stream<Integer> modifiedStream = originalStream
            .mapMulti((value, consumer) -> {
                consumer.accept(value);
                consumer.accept(value + 1);
            });

        // Now print the first 10 values from the modified stream
        modifiedStream.limit(10).forEach(IO::println);
    }
}