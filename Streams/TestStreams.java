package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
    }
}
