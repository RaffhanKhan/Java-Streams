package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {
    public static void main(String[] args) {
        List<Integer> arrayLis = Arrays.asList(1,2,3,44,5);
//        arrayLis.forEach (n -> System.out.println(n));
//        Stream stream = arrayLis.stream();
//        stream.forEach(n-> System.out.println(n));
////        stream.forEach(n-> System.out.println(n)); This won't work ifwe call stream twice
////        "Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed"
//
//        //sort and reverse sort
////        stream.sorted();
////        stream.sorted(Comparator.reverseOrder());
//
//        //below code into streams
//        for(int n : arrayLis){
//            System.out.println(n*2);
//        }
//        Stream<Integer> data = arrayLis.stream();
//        Stream<Integer> mapedStream = data.map(n -> (n)*2);
//        mapedStream.forEach(n-> System.out.println(n));
//
//        System.out.println("----------------------");
//
//        //directly doing it using 3 streams but it is memory efficent since one stream is gone after doig its task
//        arrayLis.stream()
//                .filter(n->n%2==0)
//                .map(n->n*2)
//                .forEach(n-> System.out.println(n));

        arrayLis.stream().collect(Collectors.partitioningBy(i->i%2==0));
        arrayLis.forEach(n-> System.out.println(n));

        List<Integer> nums = Arrays.asList(1,2,3,4,5,1,2,3,4);

        int res = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        double avg = nums.stream().mapToDouble(e->e).average().getAsDouble();

        Set<Integer> dup = nums.stream().filter(e-> Collections.frequency(nums, e)>1).collect(Collectors.toSet());
        List<Integer> odd = nums.stream().filter(e->e%2!=0).collect(Collectors.toList());

        Map<Integer, Long> freq = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int[] intArray = {1,2,3,4,1,2,3};
        Map<Integer, Long> arrInt = Arrays.stream(intArray).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("SL-"+ res+" Avg-"+avg+" dup"+dup+" Odd-"+odd+" freq " +freq);
    }
}
