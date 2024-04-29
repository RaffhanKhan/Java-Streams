package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixWith2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 222,234,567,890,432,236,211,22,-2231);

        List<Integer> list= nums.stream().
                        map(e->String.valueOf(e)).
                            filter(e->e.startsWith("2") || e.startsWith("-2")).
                              map(Integer::valueOf).
                                collect(Collectors.toList());
        System.out.println(list);
    }
}
