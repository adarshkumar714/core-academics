// package notes.FunctionalProgramming.ForEach;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

@FunctionalInterface
interface A{
    void accept(int n);
}

public class FE {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,6,2,7,3,7);

        // Consumer<Integer> con = new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
        
        nums.forEach((n) -> {
            n++;
            System.out.print("this number is ");
            System.out.println(n);
            System.out.println("done");
        });
        
        nums.forEach(n -> System.out.println(n));

        // method reference in forEach method
        nums.forEach(System.out::println);

        // passing custom interface
        A obj = n -> {
            System.out.println("printing using custom interface "+n);
        };
        nums.forEach(obj::accept);
    }
}
