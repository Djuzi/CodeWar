package io.djuz.kata_simple_pig_latin;

public class Main {

    public static void main(String[] args) {

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
        StringBuilder stringBuilder=new StringBuilder();

        for (String value : inputParam) {
            if (Character.isAlphabetic(value.charAt(0))) {
                char symbol = value.charAt(0);
                String substring = value.substring(1);
                stringBuilder.append(substring).append(symbol).append("ay").append(" ");
            }else {
                stringBuilder.append(value).append(" ");
            }
        }
         String trimResult = stringBuilder.toString().trim();
        System.out.println("Result->"+trimResult);

    }
}


