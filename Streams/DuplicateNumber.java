package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,2,5);
        Set<Integer> dup = nums.stream().filter(e -> Collections.frequency(nums, e)>1).collect(Collectors.toSet());
        System.out.println(dup);
    }
}
