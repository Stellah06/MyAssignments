package week3.day6;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {
    public static void main(String[] args) {
        int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};
        //adding array elements into list
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            list1.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            list2.add(b[j]);
        }
        System.out.println("Elements in list1 are "+list1);
        System.out.println("Elements in list2 are "+list2);
        //comparing 2 lists
        System.out.print("Items common in both lists are  ");
        for(int m=0;m<list1.size();m++){
            for(int n=0;n<list2.size();n++){
                if(list1.get(m).equals(list2.get(n))){
                    System.out.print(list1.get(m)+" ");
                }
            }
        }
    }
}
