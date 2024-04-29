package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1, 10, 20, 30, 15);
        List<Integer> evenList = numsList.stream().
                                    filter(e -> e%2==0)
                                        .collect(Collectors.toList());

        List<Integer>  odd = numsList.stream().filter(e-> e%2!=0).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(odd);
    }
}
