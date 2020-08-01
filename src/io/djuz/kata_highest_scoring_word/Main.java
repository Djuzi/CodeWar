package io.djuz.kata_highest_scoring_word;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //######################
        //Второй вариант решения
        //######################
        String sentenceV2 = "climbing volcano";
        final String result = Arrays.stream(sentenceV2.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum() //символ "а" = 97
                )).get();
        System.out.println(result);

        //######################
        //Первый вариант решения
        //######################
        String[] sentenceV1 = "climbing volcano".trim().split(" ");
        int number = 1;
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 'a'; i <= 'z'; i++) {
            if (number <= 26) {
                characterMap.put((char) i, number);
                number++;
            }
        }
        int charLength = 0;
        Map<String, Integer> wordLength = new LinkedHashMap<>();
        for (String word : sentenceV1) {
            final char[] chars = word.toCharArray();
            for (final char aChar : chars) {
                charLength += characterMap.get(aChar);
            }
            wordLength.put(word, charLength);
            charLength = 0;
        }
        final String key = Collections.max(wordLength.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        System.out.println(key);
    }
}


