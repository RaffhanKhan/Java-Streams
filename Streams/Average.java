package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(nums.stream().mapToInt(e -> e).average().getAsDouble());

    }
}
