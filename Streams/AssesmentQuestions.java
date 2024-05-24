package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AssesmentQuestions {

    public static int sumOfNums(List<Integer> nums){
        return nums.stream().mapToInt(e->e).sum();
    }

    public static double avg(List<Integer> nums){
        return nums.stream().mapToDouble(e->e).average().getAsDouble();
    }

    public static List<Integer> even(List<Integer> nums){
         return nums.stream().filter(e->e%2==0).collect(Collectors.toList());
    }

    public static List<Integer> squars(List<Integer> nums){
        return nums.stream().map(a->a*a).collect(Collectors.toList());
    }
 
    public static List<Integer> prefixWith2(List<Integer> nums){
        return nums.stream().map(e->String.valueOf(e))
                .filter(e->e.startsWith("2") || e.startsWith("-2"))
                .map(Integer::valueOf).collect(Collectors.toList());
    }

    public static int secondHighest(List<Integer> nums){
        return nums.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).collect(Collectors.toList()).get(0);

    }
    public static int max(List<Integer> nums){
        return nums.stream().max(Comparator.comparing(Integer::valueOf)).get();

    }

    public static List<Integer> duplicate(List<Integer> nums) {
        return nums.stream().filter(e-> Collections.frequency(nums, e)>1).collect(Collectors.toList());
    }

    public static Map<Integer, Long> freq(List<Integer> nums) {
        return nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, List<String>> freqMap(List<Employee> employeeList){
        return employeeList.stream().
                collect(Collectors.groupingBy(Employee::getCity, Collectors.mapping(Employee::getName, Collectors.toList())));
    }

    public static Map<Integer, Long> freqt(List<Integer> nums) {
        return nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<String, List<String>> emp(List<Employee> employeeList){
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.mapping(Employee::getName, Collectors.toList())));
    }


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,4,5,5);
        System.out.println(sumOfNums(nums));
        System.out.println(avg(nums));
        System.out.println(even(nums));
        System.out.println(squars(nums));
        System.out.println(prefixWith2(nums));
        System.out.println(secondHighest(nums));
        System.out.println(max(nums));
        System.out.println(duplicate(nums));
        System.out.println(freq(nums));

        Employee employee = new Employee("abcd", "efgh");
        Employee employee2 = new Employee("xyz", "ijkl");
        Employee employee3 = new Employee("raff", "vzm");
        Employee employee4 = new Employee("khan", "vzm");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println(freqMap(employeeList));


    }
}
