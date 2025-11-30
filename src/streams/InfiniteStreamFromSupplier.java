package streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

class MyInfiniteSupplier implements Supplier<Integer> {

    private int value;

    public MyInfiniteSupplier(final int startValue) {
        this.value = startValue;
    }

    @Override
    public Integer get() {
        return this.value++;
    }
}

public class InfiniteStreamFromSupplier {

    public static void main(String[] args) {

        final Stream<Integer> streamOfIntegers = Stream.generate(
            new MyInfiniteSupplier(5)
        );
        final List<Integer> listOfIntegers = streamOfIntegers
            .limit(5)
            .toList();

        System.out.println(listOfIntegers);
    }
}