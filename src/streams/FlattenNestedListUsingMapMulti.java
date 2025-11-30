package streams;

import java.util.List;

public class FlattenNestedListUsingMapMulti {

    private static final List<List<Integer>> listOfLists = List.of(
        List.of(1, 2),
        List.of(3, 4, 5)
    );

    public static void main(String[] args) {

        final List<Integer> flattenedList = listOfLists
            .stream()
            .<Integer>mapMulti((nestedList, downstream) -> nestedList.forEach(downstream))
            .toList();

        System.out.println(flattenedList);
    }
}