package io.djuz.kata_simple_pig_latin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //######################
        //Третий вариант решения
        //######################
        var valStr = "Pig latin is cool";
        String collect = Arrays.stream(valStr.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
        System.out.println(collect);

        //######################
        //Второй вариант решения
        //######################
        var str = "Pig latin, is cool";
        String result = str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        System.out.println(result);

        //######################
        //Первый вариант решения
        //######################
        var inputParam = "Pig latin is cool".trim().split(" "); //=> igPay atinlay siay oolcay
        StringBuilder stringBuilder = new StringBuilder();

        for (String value : inputParam) {
            if (Character.isAlphabetic(value.charAt(0))) {
                char symbol = value.charAt(0);
                String substring = value.substring(1);
                stringBuilder.append(substring).append(symbol).append("ay").append(" ");
            } else {
                stringBuilder.append(value).append(" ");
            }
        }
        String trimResult = stringBuilder.toString().trim();
        System.out.println("Result->" + trimResult);

    }
}


