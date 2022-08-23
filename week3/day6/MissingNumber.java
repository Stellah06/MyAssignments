package week3.day6;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] data = {3, 9, 1,2, 1, 2, 7, 4, 9, 10, 4, 8, 6, 3, 10, 7};
        //adding numbers into Set
        Set<Integer> sortedData=new TreeSet<Integer>();
        for(int i=0;i<data.length;i++){
            sortedData.add(data[i]);
        }
        System.out.println("Data in Set is "+sortedData);
        //Compare numbers in Set starting from 1
        int k=1;
             for (Integer eachNumber : sortedData) {
                 if(eachNumber==k){
                     k++;
             }else{
                     System.out.println("Missing number is "+ k);
                     break;
                 }
        }
    }
}
