package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1,10,20,30,15);
        //1 100 400 900 225 ->square
        //400 900 225 -> > 100
        //1525/3 = 508.3 -> avg
        double avg = numsList.stream()
                        .map(e -> e*e)
                            .filter(e -> e>100)
                                .mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
