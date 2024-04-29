package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = numsList.stream().reduce((a, b)->a+b);
        System.out.println(sum.get());
    }
}
