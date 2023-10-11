package ru.digitalhabbits.homework2.impl;

import java.io.File;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

//todo Make your impl
public class AsyncFileLetterCounter {
    public Map<Character, Long> count(File input) throws Exception {
        //todo
        Map<Character, Long> mapResult;
        FileReaderImpl fileReader = new FileReaderImpl();
        mapResult = fileReader.readLines(input)
                .map(s -> CompletableFuture.supplyAsync(() -> new LetterCounterImpl().count(s)))
                .map(a -> a.join())
                .reduce((a, b) -> new LetterCountMergerImpl().merge(a, b))
//                .reduce((a, b) -> CompletableFuture.supplyAsync(() -> new LetterCountMergerImpl().merge(a, b.)))
                .get();
        return mapResult;
    }
}
