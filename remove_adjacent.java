package com.dsa.cp;
import java.util.*;
public class remove_adjacent {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(9);
        int i=0;
        while(i<nums.size()-1){
            if(nums.get(i)<nums.get(i+1)){
                nums.remove(i);
                nums.remove(i+1);

            }
            else i++;
        }
        System.out.println(nums.size());
    }
}
