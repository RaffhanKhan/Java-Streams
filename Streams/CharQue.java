package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CharQue {
    public static void main(String[] args) {
        char[] ch = {'1', '2', '3', '4', '1', '2'};
        String str = new String(ch);
        String res = str.chars().distinct().mapToObj(e->String.valueOf((char) e)).collect(Collectors.joining(", "));
        // Print the unique elements
        System.out.println("Unique elements: " + res);
    }
}
