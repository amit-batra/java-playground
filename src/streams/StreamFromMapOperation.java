package streams;

import java.util.stream.Stream;

public class StreamFromMapOperation {

    public static void main(String[] args) {

        // First Create an Infinite Stream of Integers
        final Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);

        // Now create another stream by mapping elements of the first stream
        final Stream<Integer> anotherStream = infiniteStream.map(n -> n << 1);

        // Now print the first five elements from the second stream
        anotherStream.limit(5).forEach(IO::println);
    }
}