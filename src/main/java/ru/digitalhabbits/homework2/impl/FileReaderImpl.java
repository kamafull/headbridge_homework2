package ru.digitalhabbits.homework2.impl;

import ru.digitalhabbits.homework2.FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Gleb Gavrilov
 * @version 11.10.2023 09:22 (mac)
 * description -
 */
public class  FileReaderImpl implements FileReader {
    @Override
    public Stream<String> readLines(File file) throws IOException {
        return Files.lines(Paths.get(file.getAbsolutePath()));
    }
}
