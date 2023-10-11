package ru.digitalhabbits.homework2.impl;

import ru.digitalhabbits.homework2.LetterCounter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Gleb Gavrilov
 * @version 11.10.2023 09:23 (mac)
 * description -
 */
public class LetterCounterImpl implements LetterCounter {
    @Override
    public Map<Character, Long> count(String input) {
        System.out.println(Thread.currentThread().getName());
        Map<Character, Long> result = new ConcurrentHashMap<>();
        long tempCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (result.containsKey(input.charAt(i))) {
                tempCount = result.get(input.charAt(i)) + 1;
                result.put(input.charAt(i), tempCount);
            } else {
                result.put(input.charAt(i), 1L);
            }
        }
        return result;
    }
}
