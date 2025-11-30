package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadLinesFromMultipleFiles {

    private static final List<Path> filePaths = List.of(
        Path.of("resources/text-files/a.txt"),
        Path.of("resources/text-files/b.txt")
    );

    public static void main(String[] args) {

        final List<String> lines = filePaths
            .stream()
            .flatMap(filePath -> {
                try {
                    return Files.lines(filePath);
                }
                catch (IOException exception) {
                    return Stream.empty();
                }
            })
            .toList();
        
        System.out.println(lines);
    }
}