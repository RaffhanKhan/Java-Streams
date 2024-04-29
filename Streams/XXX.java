package Streams;

import java.util.*;

public class XXX {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,4,9,5,2, 6);
        Map<Integer,Integer> freq = new HashMap<>();
        for (int i:
             list) {
            if(freq.containsKey(i)){
                freq.put(i, freq.get(i)+1);

            } else
                freq.put(i,1);

        }


        freq.entrySet().stream().forEach(n->System.out.println(n));



//        list.stream().sorted(Collections.reverseOrder());
//
//        System.out.println(list.get(1));
//        list.remove()
    }
}
