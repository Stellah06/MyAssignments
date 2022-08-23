package week3.day6;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {
    public static void main(String[] args) {
        int[] data = {4,3,6,8,29,1,2,4,7,8};
        Set<Integer> removeDuplicate=new TreeSet<Integer>();
        //add numbers in Set and display duplicate numbers
        System.out.println("Duplicate numbers are");
        for(int i=0;i<data.length;i++){
            if(removeDuplicate.contains(data[i])){
                System.out.println(data[i]);
            }else{
                removeDuplicate.add(data[i]);
            }
        }
    }
}
