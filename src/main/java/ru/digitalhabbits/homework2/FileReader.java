package ru.digitalhabbits.homework2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Sequential file reader
 */
public interface FileReader {
    Stream<String> readLines(File file) throws IOException;
}
