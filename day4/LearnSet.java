package week2.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(3);
        numbers.add(54);
        numbers.add(65);
        numbers.add(22);
        numbers.add(43);
        numbers.add(67);
        numbers.add(98);
        numbers.add(1);
        System.out.println(numbers);
        Set<Integer> uniqueNum=new HashSet<Integer>(numbers);
        System.out.println("Unique Number"+uniqueNum);
        System.out.println("Duplicate Numbers ");
        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i).equals(numbers.get(j)) ){
                    System.out.println(numbers.get(i));
                }
            }
        }
    }
}