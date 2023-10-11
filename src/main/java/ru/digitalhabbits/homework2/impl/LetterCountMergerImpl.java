package ru.digitalhabbits.homework2.impl;

import ru.digitalhabbits.homework2.LetterCountMerger;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Gleb Gavrilov
 * @version 11.10.2023 09:24 (mac)
 * description -
 */
public class LetterCountMergerImpl implements LetterCountMerger {
    @Override
    public Map<Character, Long> merge(Map<Character, Long> first, Map<Character, Long> second) {
        second.forEach((k, v) -> first.merge(k, v, Long::sum));
        return first;
    }
}
