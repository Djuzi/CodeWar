package io.djuz.kata_find_the_unique_number;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {

        //######################
        //Второй вариант решения
        //######################
        double[] arr = {1, 1, 1, 2, 1, 1};
        Arrays.sort(arr);
        var dddd=arr[0] == arr[1] ? arr[arr.length-1]:arr[0];

        //######################
        //Первый вариант решения
        //######################
        double[] arr1 = {1, 1, 1, 2, 1, 1};
        final Map<Double, List<Double>> collect = DoubleStream.of(arr1).boxed().collect(groupingBy(r -> r));
        var result=collect.entrySet().stream().filter(v->v.getValue().size()<2).findFirst().get().getKey();
        System.out.println(result);
    }
}


