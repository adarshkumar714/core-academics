// package unit4;

import java.util.Set;
import java.util.HashSet;

public class my_hashset {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(3);
        nums.add(3);
        nums.add(8);
        nums.add(2);
        nums.add(0);
        nums.add(4);
        
        System.out.println(nums);
    }
}
