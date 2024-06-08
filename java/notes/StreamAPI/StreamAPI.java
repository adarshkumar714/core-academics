package notes.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(3,6,2,7,3,7);

        Stream<Integer> data = nums.stream();
        // long a = data.count();
        // System.out.println(a);
        // data.forEach(n -> System.out.println(n));

        Stream<Integer> sortedList = data.sorted();
        Stream<Integer> mapedList = sortedList.map(n -> n*n);
        mapedList.forEach(System.out::println);

        System.out.println("----------------------------Stream API--------------------------------");
        nums.stream()
        .filter(n -> n%2==1) // filtering even numbers
        .sorted()
        .map(n -> n*n)
        .forEach(System.out::println);

        System.out.println("----------------------------.filter--------------------------------");
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n%2==1) return true;
                else return false;
            }
        };

        nums.stream()
        .filter(p::test) // filtering odd numbers
        .forEach(System.out::println);
        
        System.out.println("-----------------------------.map-------------------------------");
        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            public Integer apply(Integer n){
                return n*n;
            }
        };
        
        nums.stream()
            .map(func::apply)
            .forEach(System.out::println);
    }   
}